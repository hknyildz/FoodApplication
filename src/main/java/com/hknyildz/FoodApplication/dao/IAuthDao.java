package com.hknyildz.FoodApplication.dao;

import com.hknyildz.FoodApplication.entity.UserEntity;
import com.hknyildz.FoodApplication.model.dto.UserDto;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;

import java.util.List;

public interface IAuthDao {

    UserEntity register(UserEntity userEntity);

    UserEntity update (UserEntity userEntity);

    UserEntity getByUserId(Long id);

    int removeUser(UserEntity userEntity);

    int removeUserById(Long id);

    List<UserEntity> getAll();
}
