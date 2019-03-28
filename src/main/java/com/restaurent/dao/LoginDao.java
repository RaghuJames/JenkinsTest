package com.restaurent.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restaurent.model.User;

@Repository
public interface LoginDao extends CrudRepository<User, String>{
	
	@Query("SELECT COUNT(a.userId) FROM User a Where a.userId =:userId")
	Integer getUserCount(@Param("userId") String name);
}
