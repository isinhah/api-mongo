package com.spring.nosql.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.nosql.dto.address.AddressRequestDTO;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UserRequestDTO {

    private String name;

    @JsonProperty(required = true)
    private String email;

    private String document;

    private AddressRequestDTO address;
}