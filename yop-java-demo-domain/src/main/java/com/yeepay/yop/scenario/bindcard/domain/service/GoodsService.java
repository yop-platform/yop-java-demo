/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service;


import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;

import java.util.List;

/**
 * title: 商品领域服务<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface GoodsService {


    /**
     * 创建商品
     *
     * @param goods 商品
     */
    void create(Goods goods);

    /**
     * 删除商品
     *
     * @param id 商户id
     */
    void delete(String id);

    /**
     * 更新商品
     *
     * @param goods 商品
     */
    void update(Goods goods);

    /**
     * 商品详情
     *
     * @param id 商品id
     * @return goods    商品详情
     */
    Goods detail(String id);

    /**
     * 商品列表
     *
     * @return
     */
    List<Goods> list();
}
