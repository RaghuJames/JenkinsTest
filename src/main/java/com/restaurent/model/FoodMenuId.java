package com.restaurent.model;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class FoodMenuId implements Serializable{
	private String menuCode;
	private String menuLevelCode;
	
	/*
	 * public FoodMenuId() {} public FoodMenuId(String menuCode, String
	 * menuLevelCode) { this.menuCode = menuCode; this.menuLevelCode =
	 * menuLevelCode; }
	 * 
	 * @Override public boolean equals(Object o) {
	 * 
	 * if (o == this) { return true; } if (!(o instanceof FoodMenu)) { return false;
	 * } FoodMenu menu = (FoodMenu) o; return Objects.equals(menuCode,
	 * menu.getMenuCode()) && Objects.equals(menuLevelCode,
	 * menu.getMenuLevelCode()); }
	 * 
	 * @Override public int hashCode() { return Objects.hash(menuCode,
	 * menuLevelCode); }
	 */
}

