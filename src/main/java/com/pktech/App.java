package com.pktech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;


@SpringBootApplication
//@EnableEurekaClient
//@EnableApolloConfig
//@EnableHystrixDashboard
//@EnableCircuitBreaker
//@EnableHystrix
@ComponentScan(basePackages = "com.pktech,com.pktech.osmc")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
