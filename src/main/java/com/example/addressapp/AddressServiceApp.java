package com.example.addressapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class AddressServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApp.class, args);
	}
}
