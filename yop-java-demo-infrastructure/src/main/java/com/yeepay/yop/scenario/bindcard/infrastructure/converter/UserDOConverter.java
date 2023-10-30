/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.converter;

import com.yeepay.yop.scenario.bindcard.domain.model.user.User;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/10 10:45
 */
@Mapper
public interface UserDOConverter {
    UserDOConverter INSTANCE = Mappers.getMapper(UserDOConverter.class);

    UserDO from(User user);

    List<UserDO> from(List<User> userList);

    User to(UserDO userDO);

    List<User> to(List<UserDO> userDOList);
}
