package com.restaurent.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurent.dao.FoodMenuRepository;
import com.restaurent.dao.FoodTypeRepository;
import com.restaurent.model.FoodMenu;
import com.restaurent.model.FoodType;
import com.restaurent.service.FoodMenuService;

@Service
public class FoodMenuServiceImpl implements FoodMenuService {

	@Autowired
	private FoodMenuRepository foodMenuRepository;
	
	@Autowired
	private FoodTypeRepository foodTypeRepository;
	
	@Override
	public Optional<List<FoodMenu>> findBymenuLevelCode(String menuLevelCode) {
		return this.foodMenuRepository.findBymenuLevelCode(menuLevelCode);
	}

	@Override
	public List<FoodType> getFoodType() {
		// TODO Auto-generated method stub
		List<FoodType> typeList = new ArrayList<FoodType>();
		Iterable<FoodType> l= this.foodTypeRepository.findAll();
		l.forEach(a->{
			typeList.add(new FoodType(a.getTypeCode(),a.getTypeDesc()));
			});
		return typeList;
		
	}

}
