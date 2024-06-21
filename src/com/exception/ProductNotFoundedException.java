package com.exception;

//@SuppressWarnings("serial")
public class ProductNotFoundedException extends RuntimeException {

	
	public ProductNotFoundedException() {
		super();
	}

	public ProductNotFoundedException(String message) {
		super(message);
	}
	
}
