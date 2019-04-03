package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="food_menu")
@IdClass(FoodMenuId.class)
public class FoodMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5199156021252976426L;
	
	@Id
	@Column(name="menu_code",nullable=false)
	private String menuCode;
	
	@Column(name="menu_desc",nullable=false)
	private String MenuDesc;
	
	@Id
	@Column(name="menu_lvl_code",nullable=false)
	private String menuLevelCode;
	
	@Column(name="menu_type_code",nullable=false)
	private String menuType;
	
	@Column(name="menu_parent_code")
	private String menuParentCode;
	
	
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuDesc() {
		return MenuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		MenuDesc = menuDesc;
	}
	public String getMenuLevelCode() {
		return menuLevelCode;
	}
	public void setMenuLevelCode(String menuLevelCode) {
		this.menuLevelCode = menuLevelCode;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getMenuParentCode() {
		return menuParentCode;
	}
	public void setMenuParentCode(String menuParentCode) {
		this.menuParentCode = menuParentCode;
	}
	@Override
	public String toString() {
		return "FoodMenu [menuCode=" + menuCode + ", MenuDesc=" + MenuDesc + ", menuLevelCode=" + menuLevelCode
				+ ", menuType=" + menuType + ", menuParentCode=" + menuParentCode + "]";
	}
}
