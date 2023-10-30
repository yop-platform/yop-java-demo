/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.UserDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.user.User;
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
 * @since 2023/9/21 14:42
 */
@Mapper
public interface UserDTOConverter {
    UserDTOConverter INSTANCE = Mappers.getMapper(UserDTOConverter.class);

    UserDTO from(User user);

    List<UserDTO> from(List<User> users);

    User to(UserDTO userDTO);

    List<User> to(List<UserDTO> userDTOS);
}
