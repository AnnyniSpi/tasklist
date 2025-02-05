package com.annyni.tasklist.web.mappers;

import com.annyni.tasklist.domain.user.User;
import com.annyni.tasklist.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
