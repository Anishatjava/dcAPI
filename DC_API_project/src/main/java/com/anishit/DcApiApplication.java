package com.anishit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DcApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcApiApplication.class, args);
	}

	@Bean
	public WebClient getWebClient() {
		return WebClient.builder().build();
	}
}
