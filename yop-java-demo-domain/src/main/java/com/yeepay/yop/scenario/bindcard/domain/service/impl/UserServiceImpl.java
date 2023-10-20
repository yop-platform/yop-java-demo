/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service.impl;


import com.yeepay.yop.scenario.bindcard.domain.model.user.User;
import com.yeepay.yop.scenario.bindcard.domain.model.user.enums.UserType;
import com.yeepay.yop.scenario.bindcard.domain.repository.UserRepository;
import com.yeepay.yop.scenario.bindcard.domain.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: 用户领域服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Component
public class UserServiceImpl implements UserService {

    @Setter(onMethod_ = @Autowired)
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        // TODO 待实现
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public void update(User user) {
        // TODO 待实现
    }

    @Override
    public User detail(String userId) {
        return userRepository.find(userId);
    }

    @Override
    public List<String> bindCardList(String userId, String merchantNo, UserType userType) {
        return null;// TODO 待实现
    }


}
