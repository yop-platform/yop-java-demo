/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.repository;

import com.yeepay.yop.scenario.bindcard.domain.model.user.User;

/**
 * title: 用户仓储<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface UserRepository {

    /**
     * 创建用户
     *
     * @param user 用户
     * @return true:成功，false:失败
     */
    Boolean create(User user);

    /**
     * 根据ID删除用户
     *
     * @param id 实体标识
     * @return true:成功，false:失败
     */
    Boolean delete(String id);

    /**
     * 根据ID查询用户
     *
     * @param id 实体标识
     * @return 用户详情
     */
    User find(String id);

    /**
     * 根据ID修改用户
     *
     * @param user 实体标识
     * @return true:成功，false:失败
     */
    Boolean update(User user);

}
