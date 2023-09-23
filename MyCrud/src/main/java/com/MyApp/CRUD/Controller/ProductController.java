package com.MyApp.CRUD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyApp.CRUD.Entity.Product;
import com.MyApp.CRUD.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product)
	{
		return service.save(product);
	}

}
