package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
         System.out.println("main sample-spring-boot");
		SpringApplication.run(DemoApplication.class, args);
	}
}
