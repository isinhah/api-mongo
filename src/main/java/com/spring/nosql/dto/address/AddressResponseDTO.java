package com.spring.nosql.dto.address;

import com.spring.nosql.dto.address.AddressRequestDTO;


public record AddressResponseDTO(String street,
                                 Long number,
                                 String neighborhood,
                                 String complement,
                                 String city,
                                 String zipCode) {
}