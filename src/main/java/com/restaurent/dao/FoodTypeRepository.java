package com.restaurent.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurent.model.FoodMenu;
import com.restaurent.model.FoodType;

@Repository
public interface FoodTypeRepository extends CrudRepository<FoodType, String>{

	@Query("select typeCode,typeDesc from FoodType")
	Optional<List<FoodType>> findAllFoodType();

}