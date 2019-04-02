package com.restaurent.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.restaurent.model.FoodMenu;

public interface FoodMenuRepository extends CrudRepository<List<FoodMenu>, String> {

}
