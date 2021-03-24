package com.spboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpbootApplication {

	static int test() {
		System.out.println("sksk");
		return 1;
	}
	public static void main(String[] args) {

		SpringApplication.run(SpbootApplication.class, args);
	}

}
