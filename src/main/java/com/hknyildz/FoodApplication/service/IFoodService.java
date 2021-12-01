package com.hknyildz.FoodApplication.service;

import com.hknyildz.FoodApplication.model.Food;

import java.util.List;

public interface IFoodService {
    List<Food> getList();

    Food create(Food food);

    Food update(Food food);

    String delete(Integer id);
}
