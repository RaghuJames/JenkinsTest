package com.restaurent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurent.dao.LoginDao;
import com.restaurent.model.User;
import com.restaurent.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void validateUser(User user) {
		Integer userExists = this.loginDao.getUserCount(user.getUserId());
		System.out.println(userExists);
		
	}



}
