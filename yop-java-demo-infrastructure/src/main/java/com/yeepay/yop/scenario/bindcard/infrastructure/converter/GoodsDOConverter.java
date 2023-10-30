/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.converter;

import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.GoodsDO;
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
 * @since 2023/10/8 18:38
 */
@Mapper
public interface GoodsDOConverter {
    GoodsDOConverter INSTANCE = Mappers.getMapper(GoodsDOConverter.class);

    GoodsDO from(Goods goods);

    List<GoodsDO> from(List<Goods> goodsList);

    Goods to(GoodsDO goodsDO);

    List<Goods> to(List<GoodsDO> goodsDOList);
}
