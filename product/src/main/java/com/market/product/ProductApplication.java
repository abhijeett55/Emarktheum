package com.market.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"entities","repositories", "services", "request", "restcontroller", "openfeign"})
@EntityScan({"com.market.product.entities"})
@EnableMongoRepositories(basePackages = "repositories")
@EnableFeignClients(basePackages = "openFeign")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
