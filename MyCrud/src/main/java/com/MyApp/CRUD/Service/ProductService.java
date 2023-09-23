package com.MyApp.CRUD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyApp.CRUD.Entity.Product;
import com.MyApp.CRUD.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;
	
	public Product  save(Product product)
	{
		return repo.save(product);
	}

}
