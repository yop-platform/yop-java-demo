/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.UserDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.UserVO;
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
 * @since 2023/9/8 16:55
 */
@Mapper
public interface UserVOConverter {
    UserVOConverter INSTANCE = Mappers.getMapper(UserVOConverter.class);

    UserVO from(UserDTO userDTO);

    List<UserVO> from(List<UserDTO> userDTOS);

    UserDTO to(UserVO userVO);

    List<UserDTO> to(List<UserVO> userVOS);
}
