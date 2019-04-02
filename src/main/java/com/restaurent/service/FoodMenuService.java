package com.restaurent.service;

import java.util.List;
import java.util.Optional;

import com.restaurent.model.FoodMenu;

public interface FoodMenuService {

	Optional<List<FoodMenu>> getMenuItemsByLevel(String menuLevelCode);

}
