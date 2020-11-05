package com.microServices.reports;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@Slf4j
public class ReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportsApplication.class, args);
	}

}
