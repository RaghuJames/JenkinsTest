package com.restaurent.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.restaurent.model.FoodMenu;

public interface FoodMenuRepository extends CrudRepository<FoodMenu, String> {

	Optional<List<FoodMenu>> findBymenuLevelCode(String menuLevelCode);

}
