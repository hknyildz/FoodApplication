package com.hknyildz.FoodApplication.serviceimpl;

import com.hknyildz.FoodApplication.dao.IAuthDao;
import com.hknyildz.FoodApplication.entity.UserEntity;
import com.hknyildz.FoodApplication.model.dto.UserDto;
import com.hknyildz.FoodApplication.service.IAuthService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private IAuthDao AuthDao;

    @Override
    public UserEntity create(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        return AuthDao.register(userEntity);
    }

    @Override
    public UserEntity update(UserDto userDto) throws Exception {
        UserEntity userEntity = AuthDao.getByUserId(userDto.getId());
        if (userEntity == null) {
            throw new Exception("There is no user with id: " + userDto.getId());
        }
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        return AuthDao.update(userEntity);
    }

    @Override
    public UserEntity getById(Long id) {
        return AuthDao.getByUserId(id);
    }

    @Override
    public List<UserEntity> getAll() {
        return AuthDao.getAll();
    }


    @Override
    public String removeUserById(Long id) {
        int result = AuthDao.removeUserById(id);
        return result == 1 ? ("user by id: " + id + " deleted successfully") : ("Delete operation failed");
    }


}
