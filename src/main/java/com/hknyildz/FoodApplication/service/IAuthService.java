package com.hknyildz.FoodApplication.service;

import com.hknyildz.FoodApplication.entity.UserEntity;
import com.hknyildz.FoodApplication.model.dto.UserDto;
import org.apache.catalina.User;

public interface IAuthService {
    UserEntity create(UserDto userDto);

    UserEntity update(UserDto userDto) throws Exception;

    UserEntity getById(Long id);

    String removeUserById(Long id);

    String removeUser(UserDto userDto);
}
