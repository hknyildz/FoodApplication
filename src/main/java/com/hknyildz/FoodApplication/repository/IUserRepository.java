package com.hknyildz.FoodApplication.repository;

import com.hknyildz.FoodApplication.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity,Long> {

}
