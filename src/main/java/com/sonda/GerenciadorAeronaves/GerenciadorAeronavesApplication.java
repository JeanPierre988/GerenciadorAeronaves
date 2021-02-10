package com.sonda.GerenciadorAeronaves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sonda.GerenciadorAeronaves.repository")
@SpringBootApplication
public class GerenciadorAeronavesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorAeronavesApplication.class, args);
	}

}
