package com.spring.nosql.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "address_entity")
public class AddressEntity {
    private String id;
    private String userId;
    private String street;
    private Long number;
    private String neighborhood;
    private String complement;
    private String city;
    private String zipCode;
}
