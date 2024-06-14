package com.spring.nosql.repositories;

import com.spring.nosql.infrastructure.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {
    AddressEntity findByUserId(String userId);

    @Transactional
    void deleteByUserId(String userId);
}
