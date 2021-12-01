package com.hknyildz.FoodApplication.dao;

import com.hknyildz.FoodApplication.model.Food;

import java.util.List;

public interface IFoodDao {
    List<Food> getList();

    //id null
    Food create(Food food);
    //id not null
    Food update(Food food);

    int delete(Integer id);
}
