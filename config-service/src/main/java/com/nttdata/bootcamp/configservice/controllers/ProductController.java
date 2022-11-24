package com.nttdata.bootcamp.configservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
public class ProductController {

	@Value("${product.product-name}")
	private String product;
	
	@GetMapping(path="/getProductName")
	public String getProductName(){
		return this.product;
	}
}
