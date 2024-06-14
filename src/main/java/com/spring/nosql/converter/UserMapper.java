package com.spring.nosql.converter;

import com.spring.nosql.dto.user.UserRequestDTO;
import com.spring.nosql.dto.user.UserResponseDTO;
import com.spring.nosql.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDTO toUserResponseDTO(UserEntity user);
}