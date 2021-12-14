package com.hknyildz.FoodApplication.daoimpl;

import com.hknyildz.FoodApplication.dao.IAuthDao;
import com.hknyildz.FoodApplication.entity.UserEntity;
import com.hknyildz.FoodApplication.model.dto.UserDto;
import com.hknyildz.FoodApplication.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthDaoImpl implements IAuthDao {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserEntity register(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity getByUserId(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public int removeUser(UserEntity userEntity) {
        userRepository.delete(userEntity);
        return 1;
    }

    @Override
    public int removeUserById(Long id) {
        userRepository.deleteById(id);
        return 1;
    }

    @Override
    public List<UserEntity> getAll() {
        List<UserEntity> list = (List<UserEntity>) userRepository.findAll();
        return list;
    }


}
