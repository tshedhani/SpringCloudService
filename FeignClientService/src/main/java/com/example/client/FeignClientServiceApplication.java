package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@EnableFeignClients("com.example")
public class FeignClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientServiceApplication.class, args);
	}
}
