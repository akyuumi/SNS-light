package com.app.mealman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MealmanApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MealmanApplication.class);
		logger.info("Hello Logback!!");
		SpringApplication.run(MealmanApplication.class, args);
	}

}
