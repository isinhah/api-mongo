package com.spring.nosql.converter;

import com.spring.nosql.dto.user.UserRequestDTO;
import com.spring.nosql.dto.user.UserResponseDTO;
import com.spring.nosql.infrastructure.entity.AddressEntity;
import com.spring.nosql.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.lang.annotation.Target;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "document", source = "user.document")
    @Mapping(target = "address", source = "addressEntity")
    UserResponseDTO toUserResponseDTO(UserEntity user, AddressEntity addressEntity);
}