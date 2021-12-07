package com.hknyildz.FoodApplication.serviceimpl;

import com.hknyildz.FoodApplication.dao.IFoodDao;
import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.dto.FoodDto;
import com.hknyildz.FoodApplication.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private IFoodDao foodDao;


    @Override
    public List<FoodEntity> getAllList() {
        return foodDao.getAllList();
    }

    @Override
    public FoodEntity createOrUpdate(FoodDto foodDto) {


        FoodEntity foodEntity = null;

        if (foodDto.getId() != null) {
            foodEntity = foodDao.getById(foodDto.getId());
        } else {
            foodEntity = new FoodEntity();
            foodEntity.setCreateDate(new Date());
        }

        foodEntity.setTitle(foodDto.getTitle());
        foodEntity.setDescription(foodDto.getDescription());
        foodEntity.setFoodDetails(foodDto.getFoodDetails());

        return foodDao.createOrUpdate(foodEntity);
    }
}
