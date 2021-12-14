package com.hknyildz.FoodApplication.service;

import com.hknyildz.FoodApplication.entity.UserEntity;
import com.hknyildz.FoodApplication.model.dto.UserDto;
import org.apache.catalina.User;

import java.util.List;

public interface IAuthService {
    UserEntity create(UserDto userDto);

    UserEntity update(UserDto userDto) throws Exception;

    UserEntity getById(Long id);

    List<UserEntity> getAll();

    String removeUserById(Long id);

}
