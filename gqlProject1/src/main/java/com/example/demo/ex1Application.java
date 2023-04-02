package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.query"})
public class ex1Application {
	public static void main(String[] args) {    
		SpringApplication.run(ex1Application.class, args);    
	}
	
}
