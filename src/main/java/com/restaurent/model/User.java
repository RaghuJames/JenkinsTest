package com.restaurent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rest_user")
public class User implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 9129926573041767735L;
	
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_pwd")
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
	

}
