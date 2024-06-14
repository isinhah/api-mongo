package com.spring.nosql.services;

import com.spring.nosql.converter.UserConverter;
import com.spring.nosql.converter.UserMapper;
import com.spring.nosql.dto.user.UserRequestDTO;
import com.spring.nosql.dto.user.UserResponseDTO;
import com.spring.nosql.exceptions.BusinessException;
import com.spring.nosql.infrastructure.entity.AddressEntity;
import com.spring.nosql.infrastructure.entity.UserEntity;
import com.spring.nosql.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;
    private final UserMapper userMapper;
    private final AddressService addressService;

    public UserEntity saveUser(UserEntity entity) {
        return userRepository.save(entity);
    }

    public UserResponseDTO saveUserWithAddress(UserRequestDTO dto) {
        try {
            notNull(dto, "The user data is mandatory");
            UserEntity userEntity = saveUser(userConverter.toUserEntity(dto));
            AddressEntity addressEntity = addressService.saveAddress(userConverter.toAddressEntity(dto.getAddress(), userEntity.getId()));
            return userMapper.toUserResponseDTO(userEntity, addressEntity);
        } catch (Exception e) {
            throw new BusinessException("Error saving user data");
        }
    }
}
