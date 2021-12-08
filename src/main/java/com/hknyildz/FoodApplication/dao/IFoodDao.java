package com.hknyildz.FoodApplication.dao;

import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.Food;

import java.util.List;

public interface IFoodDao {
    List<FoodEntity> getAllList();

    FoodEntity createOrUpdate(FoodEntity foodEntity);

    FoodEntity getById(Long id);

    int removeById(Long id);
}
