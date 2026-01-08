package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// it scan current package as well as sub package of current package. 
@SpringBootApplication(scanBasePackages = "com")// Enable @Controller, @Service, @Repositiory @Component 
@EntityScan(basePackages = "com.entity")
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
		System.out.println("spring boot up");
	}

}
