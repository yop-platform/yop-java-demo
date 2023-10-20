/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service.impl;


import com.yeepay.yop.scenario.bindcard.app.converter.UserDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.service.UserAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.UserDTO;
import com.yeepay.yop.scenario.bindcard.domain.gateway.UserGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindcardBindcardlistQueryBindCardResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardBindcardlistRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardBindcardlistResponse;
import com.yeepay.yop.scenario.bindcard.domain.service.UserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title: 用户应用服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Slf4j
@Service
public class UserAppServiceImpl implements UserAppService {
    @Setter(onMethod_ = @Autowired)
    private UserService userService;

    @Setter(onMethod_ = @Autowired)
    private UserGateway userGateway;


    @Override
    public void create(UserDTO userDTO) {
        // TODO 待实现
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public void update(UserDTO userDTO) {
        // TODO 待实现
    }

    @Override
    public UserDTO detail(String id) {
        return UserDTOConverter.INSTANCE.from(userService.detail(id));
    }

    @Override
    public String bindCardList(String userId, String merchantNo, String userType) throws Exception {
        BindcardBindcardlistRequest bindcardBindcardlistRequest = new BindcardBindcardlistRequest();
        bindcardBindcardlistRequest.setUserNo(userId);
        bindcardBindcardlistRequest.setUserType(userType);
        bindcardBindcardlistRequest.setMerchantNo(merchantNo);
        BindcardBindcardlistResponse bindcardBindcardlistResponse = userGateway.bindCardList(bindcardBindcardlistRequest);
        BindcardBindcardlistQueryBindCardResponseDTOResult result = bindcardBindcardlistResponse.getResult();
        if (!"NOP00000".equals(result.getCode())) {
            log.error("query bind-card list failure, msg: {}", result.getMessage());
            throw new Exception("query bind-card list failure, msg: " + result.getMessage());
        }
        return bindcardBindcardlistResponse.getResult().getBindCardList();
    }

    @Override
    public List<UserDTO> list() {
        return null;
    }


}
