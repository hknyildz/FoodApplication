package com.hknyildz.FoodApplication.controller;

import com.hknyildz.FoodApplication.model.Food;
import com.hknyildz.FoodApplication.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/food",produces = "application/json")
public class FoodController {



    @Autowired
    private IFoodService foodService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
   public List<Food> getList(){
        return foodService.getList();
   }

   @RequestMapping(value = "create",method = RequestMethod.POST)
   public Food create(@RequestBody Food food){
        return foodService.create(food);
   }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public Food update(@RequestBody Food food){
        return foodService.update(food);
    }

    @RequestMapping(value = "delete/{foodId}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer foodId){
        return foodService.delete(foodId);
    }
}
