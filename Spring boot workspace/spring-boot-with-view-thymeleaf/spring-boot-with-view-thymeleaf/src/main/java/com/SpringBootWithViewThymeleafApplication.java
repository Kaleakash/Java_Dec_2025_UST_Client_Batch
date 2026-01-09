package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")	// DI for @Controller 
public class SpringBootWithViewThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithViewThymeleafApplication.class, args);
		System.out.println("spring boot up with view as thymeleaf");
	}

}
