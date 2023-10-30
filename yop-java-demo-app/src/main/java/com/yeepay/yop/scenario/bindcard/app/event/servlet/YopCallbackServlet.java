package com.yeepay.yop.scenario.bindcard.app.event.servlet;

import com.google.common.collect.Maps;
import com.yeepay.yop.sdk.YopConstants;
import com.yeepay.yop.sdk.constants.CharacterConstants;
import com.yeepay.yop.sdk.http.YopContentType;
import com.yeepay.yop.sdk.service.common.YopCallbackEngine;
import com.yeepay.yop.sdk.service.common.callback.YopCallbackRequest;
import com.yeepay.yop.sdk.service.common.callback.YopCallbackResponse;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import static com.yeepay.yop.sdk.YopConstants.YOP_HTTP_CONTENT_TYPE_JSON;

/**
 * title: 通知接收servlet<br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wdc
 * @version 1.0.0
 * @since 2019-05-05 10:19
 */
@WebServlet(urlPatterns = YopCallbackServlet.CALLBACK_PREFIX + "/*")
public class YopCallbackServlet extends HttpServlet {

    public static final String CALLBACK_PREFIX = "/yop-callback";
    private static final Logger LOGGER = LoggerFactory.getLogger(YopCallbackServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String respStr = "";
        try {
            YopCallbackRequest callbackRequest = resolve(req);
            YopCallbackResponse callbackResponse = YopCallbackEngine.handle(callbackRequest);

            if (null != callbackResponse) {
                respStr = callbackResponse.getBody();
            }
            if (MapUtils.isNotEmpty(callbackResponse.getHeaders())) {
                callbackResponse.getHeaders().forEach(resp::addHeader);
            }
            resp.setContentType(callbackResponse.getContentType().getValue());
            resp.getOutputStream().write(respStr.getBytes(YopConstants.DEFAULT_ENCODING));
        } catch (Exception e) {
            LOGGER.error("error when handle yop callback", e);
            resp.sendError(
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                    e.getMessage());
        }
    }

    private YopCallbackRequest resolve(HttpServletRequest req) throws IOException {
        final String contentTypeStr = req.getContentType();
        Object content = null;
        YopContentType contentType;
        if (StringUtils.startsWith(contentTypeStr, YOP_HTTP_CONTENT_TYPE_JSON)) {
            contentType = YopContentType.JSON;
            content = IOUtils.toString(req.getInputStream(), YopConstants.DEFAULT_ENCODING);
        } else {
            contentType = YopContentType.FORM_URL_ENCODE;
        }
        return new YopCallbackRequest(getCallbackType(req), req.getMethod())
                .setContentType(contentType)
                .setHeaders(getHeaders(req)).setParams(getParams(req)).setContent(content);
    }

    private String getCallbackType(HttpServletRequest req) {
        String requestURI = req.getRequestURI();
        if (requestURI.equals(CALLBACK_PREFIX)) {
            return CharacterConstants.SLASH;
        }
        return StringUtils.substringAfter(requestURI, CALLBACK_PREFIX);
    }

    private Map<String, String> getHeaders(HttpServletRequest request) {
        Map<String, String> result = Maps.newHashMap();
        final Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            final String headerName = headerNames.nextElement();
            final String headerValue = request.getHeader(headerName);
            result.put(headerName, headerValue);
        }
        return result;
    }

    private Map<String, List<String>> getParams(HttpServletRequest request) {
        Map<String, List<String>> result = Maps.newHashMap();
        Map<String, String[]> params = request.getParameterMap();
        for (Map.Entry<String, String[]> param : params.entrySet()) {
            result.put(param.getKey(), Arrays.asList(param.getValue()));
        }
        return result;
    }

}
