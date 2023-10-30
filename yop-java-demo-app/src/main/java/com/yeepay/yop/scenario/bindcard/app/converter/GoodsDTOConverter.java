/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.GoodsDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/21 14:22
 */
@Mapper
public interface GoodsDTOConverter {
    GoodsDTOConverter INSTANCE = Mappers.getMapper(GoodsDTOConverter.class);

    GoodsDTO from(Goods goods);

    List<GoodsDTO> from(List<Goods> goodsList);

    Goods to(GoodsDTO goodsDTO);

    List<Goods> to(List<GoodsDTO> goodsDTOS);
}
