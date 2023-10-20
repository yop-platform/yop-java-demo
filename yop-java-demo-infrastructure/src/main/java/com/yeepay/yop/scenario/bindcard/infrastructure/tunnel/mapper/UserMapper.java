/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.UserDO;

import java.util.List;

/**
 * title: <br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface UserMapper extends BaseMapper<UserDO> {

    List<UserDO> findAll();


}
