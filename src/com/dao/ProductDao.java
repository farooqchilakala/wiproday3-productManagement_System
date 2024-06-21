package com.dao;

import java.util.Collection;

import com.model.Product;

public interface ProductDao {
	
	Collection<Product> getall();
	Product getbyId (int product_id);
	String addproducts (Product product);
	String updateproduct (Product product);
	String deleteproductById (int Id);

}
