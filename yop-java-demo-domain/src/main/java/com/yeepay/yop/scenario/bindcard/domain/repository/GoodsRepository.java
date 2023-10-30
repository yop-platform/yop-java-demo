/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.repository;


import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;

import java.util.List;

/**
 * title: 商品仓储<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface GoodsRepository {

    /**
     * 创建商品
     *
     * @param goods 商品
     * @return true:成功，false:失败
     */
    Boolean create(Goods goods);

    /**
     * 根据ID删除商品
     *
     * @param id 实体标识
     * @return true:成功，false:失败
     */
    Boolean delete(String id);

    /**
     * 根据ID查询商品
     *
     * @param id 实体标识
     * @return 商品详情
     */
    Goods find(String id);

    /**
     * 查询所有商品
     *
     * @return 商品列表
     */
    List<Goods> findAll();

    /**
     * 根据ID修改商品
     *
     * @param goods 实体标识
     * @return true:成功，false:失败
     */
    Boolean update(Goods goods);

}
