package com.example.CapitalMarketService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class CapitalMarketServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CapitalMarketServiceApplication.class, args);
	}

	@LoadBalanced
	@Bean  // we need to create class with configuration annotation decalre Bean over there
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();
	}

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){

		RestTemplate rt = new RestTemplate();
		return  rt;
	}

}
