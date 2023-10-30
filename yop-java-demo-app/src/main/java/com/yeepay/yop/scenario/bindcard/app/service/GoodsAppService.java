/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service;


import com.yeepay.yop.scenario.bindcard.client.dto.GoodsDTO;

import java.util.List;

/**
 * title: 商品应用服务<br>
 * description: 商品应用服务<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface GoodsAppService {

    /**
     * 创建商品
     *
     * @param goodsDTO 商品
     */
    void create(GoodsDTO goodsDTO);

    /**
     * 删除商品
     *
     * @param id 商品id
     */
    void delete(String id);

    /**
     * 更新商品
     *
     * @param goodsDTO 商品
     */
    void update(GoodsDTO goodsDTO);

    /**
     * 商品详情
     *
     * @param id 商品id
     * @return goodsDTO    商品详情
     */
    GoodsDTO detail(String id);

    /**
     * 商品列表
     *
     * @return list&lt;GoodsDTO&gt;
     */
    List<GoodsDTO> list();
}
