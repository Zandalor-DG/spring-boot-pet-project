package com.spring-boot-pet-project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAspectJAutoProxy
public class SpringBootPetProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootPetProjectApplication.class, args);
	}

}
