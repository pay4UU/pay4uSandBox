package com.example.todo2app;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todo2appApplication {
	
	final static Logger logger = Logger.getLogger(Todo2appApplication.class);

	public static void main(String[] args) {
		logger.info("Todo2appApplication :: main " + args);
		SpringApplication.run(Todo2appApplication.class, args);
	}
}
