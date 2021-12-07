package com.hknyildz.FoodApplication.repository;

import com.hknyildz.FoodApplication.entity.FoodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoodRepository extends CrudRepository<FoodEntity,Long> {

List<FoodEntity> findAll();


}
