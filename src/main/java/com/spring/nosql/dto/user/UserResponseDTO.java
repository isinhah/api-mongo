package com.spring.nosql.dto.user;

import com.spring.nosql.dto.address.AddressResponseDTO;

public record UserResponseDTO(String id,
        String name,
        String email,
        String document,
        AddressResponseDTO address) {
}