package com.hknyildz.FoodApplication.controller;

import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.dto.FoodDto;
import com.hknyildz.FoodApplication.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/food", produces = "application/json")
public class FoodController {

    @Autowired
    private IFoodService foodService;

    @RequestMapping(value = "createOrUpdate", method = RequestMethod.POST)
    public FoodEntity create(@RequestBody FoodDto foodDto) {
        return foodService.createOrUpdate(foodDto);
    }

//    @RequestMapping(value = "update",method = RequestMethod.PUT)
//    public Food update(@RequestBody Food food){
//        return foodService.update(food);
//    }
//
//    @RequestMapping(value = "delete/{foodId}",method = RequestMethod.DELETE)
//    public String delete(@PathVariable Integer foodId){
//        return foodService.delete(foodId);
//    }
}
