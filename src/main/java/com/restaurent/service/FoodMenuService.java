package com.restaurent.service;

import java.util.List;
import java.util.Optional;

import com.restaurent.model.FoodMenu;
import com.restaurent.model.FoodType;

public interface FoodMenuService {

	Optional<List<FoodMenu>> findBymenuLevelCode(String menuLevelCode);

	List<FoodType> getFoodType();

}
