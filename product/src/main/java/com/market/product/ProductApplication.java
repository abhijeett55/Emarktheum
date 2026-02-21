package com.market.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"entities", "repositories", "services", "request", "restController", "openFeign"})
@SpringBootApplication(scanBasePackages = {"entities","repositories", "services", "request", "restController", "openFeign"})
@EntityScan({"services", "entities"})

public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
