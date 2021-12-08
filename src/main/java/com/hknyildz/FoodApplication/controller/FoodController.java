package com.hknyildz.FoodApplication.controller;

import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.model.dto.FoodDto;
import com.hknyildz.FoodApplication.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/food", produces = "application/json")
public class FoodController {

    @Autowired
    private IFoodService foodService;

    @RequestMapping(value = "createOrUpdate", method = RequestMethod.POST)
    public FoodEntity create(@RequestBody FoodDto foodDto) {
        return foodService.createOrUpdate(foodDto);
    }

    @RequestMapping(value = "alllist",method = RequestMethod.GET)
    public List<FoodEntity> getAllList(){
        return foodService.getAllList();
    }

    @RequestMapping(value = "{foodId}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long foodId){
        return foodService.removeById(foodId);
    }
}
