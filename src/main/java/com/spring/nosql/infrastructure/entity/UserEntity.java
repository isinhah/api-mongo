package com.spring.nosql.infrastructure.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "user_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String document;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;

}
