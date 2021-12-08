package com.hknyildz.FoodApplication.daoimpl;

import com.hknyildz.FoodApplication.dao.IFoodDao;
import com.hknyildz.FoodApplication.entity.FoodEntity;
import com.hknyildz.FoodApplication.repository.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodDaoImpl implements IFoodDao {

    @Autowired
    private IFoodRepository repository;

    @Override
    public List<FoodEntity> getAllList() {
        List<FoodEntity> list = repository.findAll();
        return list;
    }

    @Override
    public FoodEntity createOrUpdate(FoodEntity foodEntity) {
        return repository.save(foodEntity);
    }

    @Override
    public FoodEntity getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public int removeById(Long id) {
        repository.deleteById(id);
        return 0;
    }
}



