package com.projet_jee.E_healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EHealthcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EHealthcareApplication.class, args);
		System.out.println("N" + System.currentTimeMillis());
	}

}
