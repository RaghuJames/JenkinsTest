package com.restaurent.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurent.dao.FoodMenuRepository;
import com.restaurent.model.FoodMenu;
import com.restaurent.model.FoodType;
import com.restaurent.service.FoodMenuService;

@Service
public class FoodMenuServiceImpl implements FoodMenuService {

	@Autowired
	private FoodMenuRepository foodMenuRepository;
	
	@Override
	public Optional<List<FoodMenu>> getMenuItemsByLevel(String menuLevelCode) {
	
		return this.foodMenuRepository.findById(menuLevelCode);
	}

}
