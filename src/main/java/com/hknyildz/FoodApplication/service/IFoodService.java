package com.hknyildz.FoodApplication.service;


import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.dto.FoodDto;


import java.util.List;

public interface IFoodService {

    List<FoodEntity> getAllList();

    FoodEntity createOrUpdate(FoodDto foodDto);

    String removeById(Long id);
}
