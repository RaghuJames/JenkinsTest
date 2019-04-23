package com.restaurent.service;

import java.util.List;

import com.restaurent.model.FoodType;
import com.restaurent.model.MainMenu;
import com.restaurent.model.SubMenu;
import com.restaurent.model.SubMenuItemsDto;

public interface FoodMenuService {


	List<FoodType> getFoodType();

	List<MainMenu> getMainMenus();

	List<SubMenuItemsDto> getAllItems();

	List<SubMenu> getSubMenus();

}
