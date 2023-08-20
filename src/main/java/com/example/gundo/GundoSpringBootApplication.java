package com.example.gundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.gundo.controllers.*", "com.example.gundo.config"})
public class GundoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GundoSpringBootApplication.class, args);
	}

}
