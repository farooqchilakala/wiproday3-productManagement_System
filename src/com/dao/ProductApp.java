package com.dao;

import java.util.Collection;
import java.util.Scanner;

import com.exception.ProductNotFoundedException;
import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductApp {
	
		
		private static Scanner sc=new Scanner(System.in);
		
		private static ProductService productService=new ProductServiceImpl();

		public static void main(String[] args) {
			
			int choice=0;
			
			while(true) {
				
				System.out.println("1. Show All products");
				System.out.println("2. Find product By Id");
				System.out.println("3. Add product");
				System.out.println("4. Update product");
				System.out.println("5. Delete product");
				System.out.println("6. Exit");
				
				choice=sc.nextInt();
				
				
				switch (choice) {
				
				case 1:
					Collection<Product> product = productService.getall();
					for (Product product2 : product) {
						System.out.println(product);
						
					}
					System.out.println();
					
					break;
					case 2:
						try {
							System.out.println("Enter the product id");
							int id= sc.nextInt();
						  Product byId = productService.getById(id);
						  System.out.println(byId);
						  System.out.println();
							
						} catch (ProductNotFoundedException e) {
							e.printStackTrace();
							System.out.println(e.getMessage());
						}
						break;
					
					case 3:
						addProducts();
						break;
					
					case 4:
						updateproduct();
						break;
					
					case 5:
						deleProduct();
						break;
					case 6:
						System.exit(0);
						
				default:
						System.out.println("Invalid option, please try again");
						
				
				}
			}
		}
				private static void addProducts() {
					Product product = new Product();
					
					System.out.println("Enter product id:");
					product.setProduct_id(sc.nextInt());
					sc.nextLine();
					
					System.out.println("Enter  product name");
					product.setProduct_name(sc.nextLine());
					
					System.out.println("Enter product price");
					product.setProduct_price(sc.nextInt());
					sc.nextLine();
					
					System.out.println("Enter product description");
					product.setProduct_description(sc.nextLine());
					
					System.out.println("Enter product quantity");
					product.setProduct_quantityInHand(sc.nextInt());
					
//					System.out.println("Enter product orderdate");
//					product.setProduct_orderdate(sc.nextLine());
//					
					String result = productService.addproduct(product);
					System.out.println(result);
					System.out.println();
				
					
				}
		
				private static void updateproduct() {
					Product product = new Product();
					
					System.out.println("Enter product id:");
					product.setProduct_id(sc.nextInt());
					sc.nextLine();
					
					System.out.println("Enter  product name");
					product.setProduct_name(sc.nextLine());
					
					System.out.println("Enter product price");
					product.setProduct_price(sc.nextInt());
					sc.nextLine();
					
					System.out.println("Enter product description");
					product.setProduct_description(sc.nextLine());
					
					System.out.println("Enter product quantity");
					product.setProduct_quantityInHand(sc.nextInt());
					
					String result = productService.updateproduct(product);
					System.out.println(result);
					System.out.println();
			
				}
				private static void deleProduct() {
					
					System.out.println("Enter product Id");
					int id=sc.nextInt();
					String result=productService.deleteproductById(id);
					System.out.println(result);
					System.out.println();
							
						}			
			}
			
	