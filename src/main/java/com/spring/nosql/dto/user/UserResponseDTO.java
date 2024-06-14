package com.spring.nosql.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.nosql.dto.address.AddressRequestDTO;
import lombok.*;


public record UserResponseDTO(Long id,
        String name,
        String email,
        String document,
        AddressRequestDTO address) {
}