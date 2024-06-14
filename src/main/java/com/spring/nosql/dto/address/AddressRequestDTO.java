package com.spring.nosql.dto.address;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class AddressRequestDTO {
    private String street;
    private Long number;
    private String neighborhood;
    private String complement;
    private String city;
    private String zipCode;
}
