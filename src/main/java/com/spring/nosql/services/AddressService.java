package com.spring.nosql.services;

import com.spring.nosql.infrastructure.entity.AddressEntity;
import com.spring.nosql.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressEntity saveAddress(AddressEntity entity) {
        return addressRepository.save(entity);
    }

    public AddressEntity findByUserId(String userId) {
        return addressRepository.findByUserId(userId);
    }

    public void deleteByUserId(String userId) {
        addressRepository.deleteByUserId(userId);
    }
}