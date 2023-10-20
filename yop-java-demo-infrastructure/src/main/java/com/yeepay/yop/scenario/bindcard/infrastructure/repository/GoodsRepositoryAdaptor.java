/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;
import com.yeepay.yop.scenario.bindcard.domain.repository.GoodsRepository;
import com.yeepay.yop.scenario.bindcard.infrastructure.converter.GoodsDOConverter;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.GoodsDO;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.mapper.GoodsMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: 商品仓储适配器<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Component
public class GoodsRepositoryAdaptor implements GoodsRepository {

    @Setter(onMethod_ = @Autowired)
    private GoodsMapper goodsMapper;


    @Override
    public Boolean create(Goods goods) {
        GoodsDO goodsDO = GoodsDOConverter.INSTANCE.from(goods);
        return goodsMapper.insert(goodsDO) > 0;
    }

    @Override
    public Boolean delete(String id) {
        return goodsMapper.deleteById(id) > 0;
    }

    @Override
    public Goods find(String id) {
        return GoodsDOConverter.INSTANCE.to(goodsMapper.selectById(id));
    }

    @Override
    public List<Goods> findAll() {
        QueryWrapper<GoodsDO> queryWrapper = Wrappers.query();
        return GoodsDOConverter.INSTANCE.to(goodsMapper.selectList(queryWrapper));
    }

    @Override
    public Boolean update(Goods goods) {
        GoodsDO goodsDO = GoodsDOConverter.INSTANCE.from(goods);
        return goodsMapper.updateById(goodsDO) > 0;
    }


}
