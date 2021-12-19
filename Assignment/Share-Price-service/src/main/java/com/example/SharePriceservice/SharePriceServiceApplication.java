package com.example.SharePriceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SharePriceServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SharePriceServiceApplication.class, args);
	}


}
