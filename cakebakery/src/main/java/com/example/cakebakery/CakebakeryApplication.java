package com.example.cakebakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakeryApplication implements CommandLineRunner {

//	@Autowired
	final Frosting frosting; //dependency injection
	final Syrup syrup;

	public CakebakeryApplication(Frosting frosting, Syrup syrup) {
		this.frosting = frosting;  // constructor injection //preferred
		this.syrup = syrup;
	}

	public static void main(String[] args) {
		SpringApplication.run(CakebakeryApplication.class, args);

		System.out.println("Cake Bakery Application is running!");
	}

	@Override
	public void run(String... args) throws Exception {
		frosting.getFrostingType();
		syrup.getSyrupType();
	}


}
