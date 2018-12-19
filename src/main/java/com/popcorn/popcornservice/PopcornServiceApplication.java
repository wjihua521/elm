package com.popcorn.popcornservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.popcorn.popcornservice")
@MapperScan("com.popcorn.popcornservice.dao.mapper")
public class PopcornServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PopcornServiceApplication.class, args);
	}

}

