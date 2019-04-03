package com.restaurent.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurent.exception.handler.MenuItemsNotFoundException;
import com.restaurent.model.FoodMenu;
import com.restaurent.model.FoodType;
import com.restaurent.service.FoodMenuService;

@RestController
@RequestMapping(value="/menu")
public class FoodMenuController {

	@Autowired
	private FoodMenuService foodMenuService;
	
	@GetMapping(value="/items/{menuLevelCode}")
	private ResponseEntity<List<FoodMenu>>  getFoodMenuItems(@PathVariable("menuLevelCode") String menuLevelCode){
		Optional<List<FoodMenu>> menuList = this.foodMenuService.findBymenuLevelCode(menuLevelCode);
		List<FoodMenu> l = new ArrayList<>();
		if(menuList.isPresent()) {
			l = menuList.get();
		}else {
			throw new MenuItemsNotFoundException("Items are not found for given menu level code "+menuLevelCode);
		}
		
		return new ResponseEntity<List<FoodMenu>>(l, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping(value="/type")
	private ResponseEntity<List<FoodType>>  getFoodType(){
		
		List<FoodType> typeList = this.foodMenuService.getFoodType();
		
		return new ResponseEntity<List<FoodType>>(typeList, new HttpHeaders(), HttpStatus.OK);
	}
	
}
