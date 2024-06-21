package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Product implements Comparable<Product> {
	
	private int product_id;
	private String product_name;
	private double product_price;
	private String product_description;
	private int product_quantityInHand;
//	private Date product_orderdate;
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public Product(int i, String string, int j, String string2, int k) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_description = product_description;
		this.product_quantityInHand = product_quantityInHand;
		
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public int getProduct_quantityInHand() {
		return product_quantityInHand;
	}

	public void setProduct_quantityInHand(int product_quantityInHand) {
		this.product_quantityInHand = product_quantityInHand;
	}

	
    
//	public Date getProduct_orderdate() {
//		return product_orderdate;
//	}
//
//	public void setProduct_orderdate(Date product_orderdate) {
//		this.product_orderdate = product_orderdate;
//	}

	public static SimpleDateFormat getDateformat() {
		return dateFormat;
	}

	@Override
	public int compareTo(Product other) {
		return Integer.compare(this.product_id, other.product_id);
	}

	@Override
	public String toString() {
		return "Product{" +
				"product_id=" + product_id +
				", product_name='" + product_name + '\'' +
				", product_price=" + product_price +
				", product_description='" + product_description + '\'' +
				", product_quantityInHand=" + product_quantityInHand +
				", product_orderdate=" +"" +
				'}';
	}
}
