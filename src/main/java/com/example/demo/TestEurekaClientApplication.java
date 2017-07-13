package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * http://blog.didispace.com/spring-cloud-starter-dalston-1/
 * eureka客户端，@EnableEurekaClient注册服务
 * spring.application.name=test-eureka-client  注册进eureka的名字
 * eureka.client.service-url.defaultZone=http://localhost:1001/eureka/ eureka服务端的地址
 */

@EnableEurekaClient
@SpringBootApplication
public class TestEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaClientApplication.class, args);
	}
}
