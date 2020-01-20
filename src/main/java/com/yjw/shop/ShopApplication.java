package com.yjw.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yjw.shop.b2c.mapper")
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
