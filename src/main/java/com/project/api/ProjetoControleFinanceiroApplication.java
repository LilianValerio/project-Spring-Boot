package com.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "endpoint")
public class ProjetoControleFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoControleFinanceiroApplication.class, args);
	}

}

