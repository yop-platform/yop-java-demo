/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.GoodsDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.GoodsVO;
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
 * @since 2023/9/21 10:36
 */
@Mapper
public interface GoodsVOConverter {
    GoodsVOConverter INSTANCE = Mappers.getMapper(GoodsVOConverter.class);

    GoodsVO from(GoodsDTO goodsDTO);

    List<GoodsVO> from(List<GoodsDTO> goodsDTOS);

    GoodsDTO to(GoodsVO goodsVO);

    List<GoodsDTO> to(List<GoodsVO> goodsVOS);
}
