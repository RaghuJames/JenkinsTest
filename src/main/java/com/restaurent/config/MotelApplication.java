package com.restaurent.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.restaurent.controller","com.restaurent.service.impl"})
@EnableJpaRepositories(basePackages= {"com.restaurent.dao"})
@EntityScan(basePackages= {"com.restaurent.model"})
public class MotelApplication {
	public static void main(String[] args) {
		SpringApplication.run(MotelApplication.class, args);
	}
}
