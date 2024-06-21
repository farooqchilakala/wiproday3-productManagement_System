package com.service;

import java.util.Collection;

import com.model.Product;

public interface ProductService {
	
	Collection<Product> getall();
	Product getById (int product_id);
	String  addproduct (Product product);
	String updateproduct (Product product);
	String deleteproductById (int Id);

}
