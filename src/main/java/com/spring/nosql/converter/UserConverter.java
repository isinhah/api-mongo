package com.spring.nosql.converter;

import com.spring.nosql.dto.address.AddressRequestDTO;
import com.spring.nosql.dto.user.UserRequestDTO;
import com.spring.nosql.infrastructure.entity.AddressEntity;
import com.spring.nosql.infrastructure.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class UserConverter {
    public UserEntity toUserEntity(UserRequestDTO userDTO) {
        return UserEntity.builder()
                .name(userDTO.getName())
                .document(userDTO.getDocument())
                .email(userDTO.getEmail())
                .registrationDate(LocalDateTime.now())
                .address(toAddressEntity(userDTO.getAddress()))
                .build();

    }

    private AddressEntity toAddressEntity(AddressRequestDTO addressDTO) {
        return AddressEntity.builder()
                .street(addressDTO.getStreet())
                .neighborhood(addressDTO.getNeighborhood())
                .zipCode(addressDTO.getZipCode())
                .city(addressDTO.getCity())
                .number(addressDTO.getNumber())
                .complement(addressDTO.getComplement())
                .build();
    }
}
