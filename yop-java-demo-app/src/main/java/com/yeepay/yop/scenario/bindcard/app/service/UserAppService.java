/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service;


import com.yeepay.yop.scenario.bindcard.client.dto.UserDTO;

import java.util.List;

/**
 * title: 用户应用服务<br>
 * description: 用户应用服务<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface UserAppService {

    /**
     * 创建用户
     *
     * @param userDTO 用户
     */
    void create(UserDTO userDTO);

    /**
     * 删除用户
     *
     * @param id 用户id
     */
    void delete(String id);

    /**
     * 更新用户
     *
     * @param userDTO 用户
     */
    void update(UserDTO userDTO);

    /**
     * 用户详情
     *
     * @param id 用户id
     * @return userDTO    用户详情
     */
    UserDTO detail(String id);

    /**
     * 查询用户的签约/绑卡列表
     *
     * @param userId     用户id
     * @param merchantNo 商编
     * @param userType   用户类型
     * @return list&lt;String&gt;
     */
    String bindCardList(String userId, String merchantNo, String userType) throws Exception;

    /**
     * 用户列表
     *
     * @return
     */
    List<UserDTO> list();

}
