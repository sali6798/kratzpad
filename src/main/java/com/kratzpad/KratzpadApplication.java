package com.kratzpad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class KratzpadApplication {

	public static void main(String[] args) {
		SpringApplication.run(KratzpadApplication.class, args);
	}

}
