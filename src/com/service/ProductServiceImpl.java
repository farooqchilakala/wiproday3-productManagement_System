package com.service;

import java.util.Collection;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.model.Product;

public class ProductServiceImpl implements ProductService {

	
	private ProductDao  dao = new ProductDaoImpl();

	@Override
	public Collection<Product> getall() {
		return dao.getall();
	}

	@Override
	public Product getById(int product_id) {
		return dao.getbyId(product_id);
	}
	@Override
	public String addproduct(Product product) {
		return dao.addproducts(product);
	}

	@Override
	public String updateproduct(Product product) {
		return dao.updateproduct(product);
	}

	@Override
	public String deleteproductById(int Id) {
		return dao.deleteproductById(Id);
	}
	
}
