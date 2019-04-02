package com.restaurent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurent.model.FoodMenu;
import com.restaurent.service.FoodMenuService;

@RestController
@RequestMapping(value="/menuItem")
public class FoodMenuController {

	@Autowired
	private FoodMenuService foodMenuService;
	
	@GetMapping(value="/{menuLevelCode}")
	private List<FoodMenu> getFoodMenuItems(@PathVariable("menuLevelCode") String menuLevelCode){
		Optional<List<FoodMenu>> menuList = this.foodMenuService.getMenuItemsByLevel(menuLevelCode);
		
		if(menuList.isPresent()) {
			List<FoodMenu> l = menuList.get();
			System.out.println(l.toString());
		}
			
		
		System.out.println();
		return null;
	}
}
