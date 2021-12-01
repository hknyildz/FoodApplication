package com.hknyildz.FoodApplication.daoimpl;

import com.hknyildz.FoodApplication.dao.IFoodDao;
import com.hknyildz.FoodApplication.model.Food;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoodDaoimpl implements IFoodDao {

    private static final List<Food> foods = new ArrayList<>();
    private static int i = 0;


    @Override
    public List<Food> getList() {
        return foods;
    }

    @Override
    public Food create(Food food) {
        i = i + 1;
        food.setId(i);
        foods.add(food);
        return food;
    }

    @Override
    public Food update(Food food) {


        for (Food item : foods) {

            if (item.getId() == food.getId()) {
                item.setTitle(food.getTitle());
                item.setDescription(food.getDescription());
                item.setLastModifiedDate(food.getLastModifiedDate());
                return food;
            }
        }

        return food;
    }

    @Override
    public int delete(Integer id) {
        int index=-1;
        for (i = 0; i < foods.size(); i++) {
            if (foods.get(i).getId()==id){

                index=i;
                break;
            }
        }
        if (index == -1)
        {
            throw new IllegalStateException("İd bulunamadi");
        }
        else{
            foods.remove(index);
            return 1;
        }


    }
}
