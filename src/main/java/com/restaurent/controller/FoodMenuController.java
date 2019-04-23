package com.restaurent.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurent.model.FoodType;
import com.restaurent.model.Items;
import com.restaurent.model.MainMenu;
import com.restaurent.model.SubMenu;
import com.restaurent.model.SubMenuItemsDto;
import com.restaurent.service.FoodMenuService;

@RestController
@RequestMapping(value="/menu")
public class FoodMenuController {

	@Autowired
	private FoodMenuService foodMenuService;

	@GetMapping(value="/type")
	private ResponseEntity<List<FoodType>>  getFoodType(){
		List<FoodType> typeList = this.foodMenuService.getFoodType();
		return new ResponseEntity<List<FoodType>>(typeList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping(value="/mainMenu")
	private ResponseEntity<List<MainMenu>>  getMainMenus(){
		List<MainMenu> typeList = this.foodMenuService.getMainMenus();
		return new ResponseEntity<List<MainMenu>>(typeList, new HttpHeaders(), HttpStatus.OK);
	}
	

	@GetMapping(value="/subMenu")
	private ResponseEntity<List<SubMenu>>  getSubMenus(){
		List<SubMenu> typeList = this.foodMenuService.getSubMenus();
		return new ResponseEntity<List<SubMenu>>(typeList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping(value="/items")
	private ResponseEntity<Map<String, Map<String, List<SubMenuItemsDto>>>>  getItems(){
		List<SubMenuItemsDto> typeList = this.foodMenuService.getAllItems();
		Map<String, Map<String, List<SubMenuItemsDto>>>  map =  
										typeList.stream()
												.filter( l -> l.getSmcode()!=null)
												.collect(Collectors.groupingBy(SubMenuItemsDto::getMcode
																	,Collectors.groupingBy(SubMenuItemsDto::getSmcode)));
		return new ResponseEntity<Map<String, Map<String, List<SubMenuItemsDto>>>>(map, new HttpHeaders(), HttpStatus.OK);
	}
	
	
}
