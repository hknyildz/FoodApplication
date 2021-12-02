package com.hknyildz.FoodApplication.service;

import com.hknyildz.FoodApplication.dto.FoodDto;
import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.Food;

import java.util.List;

public interface IFoodService {

    List<FoodEntity> getAllList();

    FoodEntity createOrUpdate(FoodDto foodDto);

}
