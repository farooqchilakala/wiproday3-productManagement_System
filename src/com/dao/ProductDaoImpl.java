package com.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.exception.ProductNotFoundedException;
import com.model.Product;

public class ProductDaoImpl implements ProductDao {

	
	
	private static Map<Integer, Product> map= new HashMap<>();
	
	
	
	public ProductDaoImpl() {
//		map.put(1,new Product(1,"Laptop",35000,"hp pavilion 360",10));
//		map.put(3,new Product(2,"RoboRacer remote car",5000,"RoboRacer it is a remote car ",60));
//		map.put(4,new Product(3,"Pen",100,"pen toen meow",1000));
		
	}

	@Override
	public Collection<Product> getall() {
		return map.values();
	}

	@Override
	public Product getbyId(int product_id) {
		Product product =map.get(product_id);
		if (map==null) {
			throw new ProductNotFoundedException("Product with id" +product_id+"does not exist");
		}
		return product;
	}

	@Override
	public String addproducts(Product product) {
		map.put(product.getProduct_id(), product);
		return "Product with id" +product.getProduct_id()+"added sucessfully";
	}

	@Override
	public String updateproduct(Product product) {
		Product product2 =map.get(product.getProduct_id());
		
		product2.setProduct_name(product.getProduct_name());
		product2.setProduct_price(product.getProduct_price());
		product2.setProduct_quantityInHand(product.getProduct_quantityInHand());
//		product2.setProduct_orderdate(product.getProduct_orderdate());
		return "product with id "+product.getProduct_id()+"added sucessfully";
	}

	@Override
	public String deleteproductById(int Id) {
		map.remove(Id);
		return "product with id"+Id+"added sucessfally";
	}

}
