package com.sathwik.spring.springcoreAdvanced.standalone.collections;

import java.util.List;
import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;

public class ProductList {
	//@Autowired(required=true)
	private Map<String, String> products;

	public Map<String, String> getProducts() {
		return products;
	}

	public void setProducts(Map<String, String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductList [products=" + products + "]";
	}

	
}
