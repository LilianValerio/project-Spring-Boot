package com.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "endpoint")
public class ProjetoControleFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoControleFinanceiroApplication.class, args);
	}

}

