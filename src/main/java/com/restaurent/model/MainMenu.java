package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="main_menu")
public class MainMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8027200792909162320L;

	@Id
	@Column(name="mainmenu_code")
	private String menuCode;
	@Column(name="mainmenu_desc")
	private String menuDesc;

	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuDesc() {
		return menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	@Override
	public String toString() {
		return "MainMenu [menuCode=" + menuCode + ", menuDesc=" + menuDesc + "]";
	}
}
