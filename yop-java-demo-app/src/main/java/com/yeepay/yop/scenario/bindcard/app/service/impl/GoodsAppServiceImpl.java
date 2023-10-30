/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service.impl;


import com.yeepay.yop.scenario.bindcard.app.converter.GoodsDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.service.GoodsAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.GoodsDTO;
import com.yeepay.yop.scenario.bindcard.domain.service.GoodsService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title: 商品应用服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Service
public class GoodsAppServiceImpl implements GoodsAppService {

    @Setter(onMethod_ = @Autowired)
    private GoodsService goodsService;

    @Override
    public void create(GoodsDTO goodsDTO) {
        // TODO 待实现
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public void update(GoodsDTO goodsDTO) {
        // TODO 待实现
    }

    @Override
    public GoodsDTO detail(String id) {
        return GoodsDTOConverter.INSTANCE.from(goodsService.detail(id));
    }

    @Override
    public List<GoodsDTO> list() {
        return GoodsDTOConverter.INSTANCE.from(goodsService.list());
    }
}
