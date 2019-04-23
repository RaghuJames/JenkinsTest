package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items implements Serializable	{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5628212752874730549L;
	
	@Id
	@Column(name="item_code")
	private String itemCode;
	@Column(name="item_desc")
	private String itemDesc;
	@Column(name="item_type")
	private String itemType;
	@Column(name="item_sub_menu_code")
	private String itemsSubMenuCode;
	@Column(name="item_price")
	private Double itemPrice;
	
	@ManyToOne
	@JoinColumn(name="sub_menu_code")
	private SubMenu subMenu;
	
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public SubMenu getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(SubMenu subMenu) {
		this.subMenu = subMenu;
	}
	
	public String getItemsSubMenuCode() {
		return itemsSubMenuCode;
	}
	public void setItemsSubMenuCode(String itemsSubMenuCode) {
		this.itemsSubMenuCode = itemsSubMenuCode;
	}
	
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Items [itemCode=" + itemCode + ", itemDesc=" + itemDesc +", itemType=" + itemType + ", subMenu="
				+ subMenu.toString() + "]";
	}
	

	
}
