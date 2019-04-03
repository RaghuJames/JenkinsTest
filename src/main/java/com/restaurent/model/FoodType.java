package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_type")
public class FoodType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6907096037052234033L;
	
	 public FoodType() {}
	 
	 public FoodType(String typeCode, String typeDesc) {
		super();
		this.typeCode = typeCode;
		this.typeDesc = typeDesc;
	 }


	@Id
	@Column(name="type_code",nullable=false)
	private String typeCode;
	
	@Column(name="type_desc", nullable=false)
	private String typeDesc;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeDesc() {
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	
}
