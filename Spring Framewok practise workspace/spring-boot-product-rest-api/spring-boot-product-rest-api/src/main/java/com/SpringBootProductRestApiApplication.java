package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  // enable @RestController, @Service, @Repository 
@EntityScan(basePackages = "com.bean")  // enable @Entity annotation 
@EnableJpaRepositories(basePackages = "com.repository")  // enable spring jpa data features 
public class SpringBootProductRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductRestApiApplication.class, args);
		System.out.println("spring boot with product rest api up");
	}

}
