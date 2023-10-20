/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service;


import com.yeepay.yop.scenario.bindcard.domain.model.user.User;
import com.yeepay.yop.scenario.bindcard.domain.model.user.enums.UserType;

import java.util.List;

/**
 * title: 用户领域服务<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface UserService {

    /**
     * 创建用户
     *
     * @param user 用户
     */
    void create(User user);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void delete(String id);

    /**
     * 更新用户
     *
     * @param user 用户
     */
    void update(User user);

    /**
     * 用户详情
     *
     * @param id 用户id
     * @return user    用户详情
     */
    User detail(String id);

    /**
     * 查询用户的签约/绑卡列表
     *
     * @param id         用户id
     * @param merchantNo 商编号
     * @param type       用户类型
     * @return list&lt;String&gt;	绑卡信息列表
     */
    List<String> bindCardList(String id, String merchantNo, UserType type);

}
