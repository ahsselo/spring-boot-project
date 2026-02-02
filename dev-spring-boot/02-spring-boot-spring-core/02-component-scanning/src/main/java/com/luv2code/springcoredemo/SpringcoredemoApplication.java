package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//when you want to pull a package that is not within the same project folder, we can use this
//set of commands to pull from others
/*@SpringBootApplication(
        scanBasePackages = {"com.luv2code.springcoredemo", "com.luv2code.util"}
)*/

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
