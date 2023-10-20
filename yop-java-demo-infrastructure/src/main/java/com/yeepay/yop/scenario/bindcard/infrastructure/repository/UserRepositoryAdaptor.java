/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.repository;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.yeepay.yop.scenario.bindcard.domain.model.user.User;
import com.yeepay.yop.scenario.bindcard.domain.repository.UserRepository;
import com.yeepay.yop.scenario.bindcard.infrastructure.converter.UserDOConverter;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.UserDO;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.mapper.UserMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * title: 用户仓储适配器<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Component
public class UserRepositoryAdaptor implements UserRepository {

    @Setter(onMethod_ = @Autowired)
    private UserMapper userMapper;

    @Override
    public Boolean create(User user) {
        UserDO userDO = UserDOConverter.INSTANCE.from(user);
        return userMapper.insert(userDO) > 0;
    }

    @Override
    public Boolean delete(String id) {
        return userMapper.deleteById(id) > 0;
    }

    @Override
    public User find(String id) {
        UserDO userDO = userMapper.selectById(id);
        if (ObjectUtils.isNotEmpty(userDO)) {
            return UserDOConverter.INSTANCE.to(userDO);
        }
        return null;
    }

    @Override
    public Boolean update(User user) {
        UserDO userDO = UserDOConverter.INSTANCE.from(user);
        return userMapper.updateById(userDO) > 0;
    }


}
