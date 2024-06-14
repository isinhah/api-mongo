package com.spring.nosql.dto.address;

public record AddressResponseDTO(String street,
                                 Long number,
                                 String neighborhood,
                                 String complement,
                                 String city,
                                 String zipCode) {
}