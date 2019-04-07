package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sub_menu")
public class SubMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4423562423583207740L;
	
	@Id
	@Column(name="sub_menu_code")
	private String subMenuCode;
	@Column(name="sub_menu_desc")
	private String subMenuDesc;
	@Column(name="main_menu_code")
	private String mainMenuCode;
	
	@ManyToOne
	@JoinColumn(name="mainmenu_code")
	private MainMenu mainMenu;
	
	public String getSubMenuCode() {
		return subMenuCode;
	}
	public void setSubMenuCode(String subMenuCode) {
		this.subMenuCode = subMenuCode;
	}
	public String getSubMenuDesc() {
		return subMenuDesc;
	}
	public void setSubMenuDesc(String subMenuDesc) {
		this.subMenuDesc = subMenuDesc;
	}
	@Override
	public String toString() {
		return "SubMenu [subMenuCode=" + subMenuCode + ", subMenuDesc=" + subMenuDesc + "]";
	}
		
}
