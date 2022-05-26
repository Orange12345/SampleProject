package com.local.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.local.tcs"})
@SpringBootApplication
public class SpringBootMainClass {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMainClass.class, args);
	}

}
