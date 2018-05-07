package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients("com.example")
@ComponentScan("com.example")
@EnableDiscoveryClient
public class RibbonClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientServiceApplication.class, args);
	}
}
