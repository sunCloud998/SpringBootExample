package com.sfy.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sfy.example.dao")
public class SpringBootStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApplication.class, args);
	}
}
