package com.restaurent.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurent.dao.FoodTypeRepository;
import com.restaurent.dao.ItemsRepository;
import com.restaurent.dao.MainMenuRepository;
import com.restaurent.dao.SubMenuRepository;
import com.restaurent.model.FoodType;
import com.restaurent.model.MainMenu;
import com.restaurent.model.SubMenu;
import com.restaurent.model.SubMenuItemsDto;
import com.restaurent.service.FoodMenuService;

@Service
public class FoodMenuServiceImpl implements FoodMenuService {
	
	@Autowired
	private FoodTypeRepository foodTypeRepository;
	@Autowired
	private MainMenuRepository mainMenuRepository;
	@Autowired
	private SubMenuRepository subMenuRepository;
	@Autowired
	private ItemsRepository itemsRepository;
	

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

	@Override
	public List<MainMenu> getMainMenus() {
		List<MainMenu> mainMenuList = new ArrayList<>();
		Iterable<MainMenu> l= this.mainMenuRepository.findAll();
		l.forEach(mainMenuList::add);
		return mainMenuList;
	}

	@Override
	public List<SubMenuItemsDto> getAllItems() {
		List<SubMenuItemsDto> itemsList= this.itemsRepository.fetchSubItemsDataLeftJoin();
		return itemsList;
	
	}

	@Override
	public List<SubMenu> getSubMenus() {
		List<SubMenu> subMenuList = new ArrayList<>();
		Iterable<SubMenu> l= this.subMenuRepository.findAll();
		l.forEach(subMenuList::add);
		return subMenuList;
	}

}
