/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service.impl;


import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;
import com.yeepay.yop.scenario.bindcard.domain.repository.GoodsRepository;
import com.yeepay.yop.scenario.bindcard.domain.service.GoodsService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: 商品领域服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Component
public class GoodsServiceImpl implements GoodsService {
    @Setter(onMethod_ = @Autowired)
    private GoodsRepository goodsRepository;

    @Override
    public void create(Goods goods) {
        // TODO 待实现
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public void update(Goods goods) {
        // TODO 待实现
    }

    @Override
    public Goods detail(String id) {
        return goodsRepository.find(id);
    }

    @Override
    public List<Goods> list() {
        return goodsRepository.findAll();
    }
}
