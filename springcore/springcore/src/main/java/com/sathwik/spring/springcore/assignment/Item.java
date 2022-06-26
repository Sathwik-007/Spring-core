package com.sathwik.spring.springcore.assignment;

public class Item {
	private int id;
	private String name;
	private double price;
	private int quantity;

	public int getId() {
		// System.out.println("Inside getId Mehod");
		return id;
	}

	public void setId(int id) {
		// System.out.println("Inside setId Mehod");
		this.id = id;
	}

	public String getName() {
		// System.out.println("Inside getName Mehod");
		return name;
	}

	public void setName(String name) {
		// System.out.println("Inside setName Mehod");
		this.name = name;
	}

	public double getPrice() {
		// System.out.println("Inside getPrice Mehod");
		return price;
	}

	public void setPrice(double price) {
		// System.out.println("Inside setPrice Mehod");
		this.price = price;
	}

	public int getQuantity() {
		// System.out.println("Inside getQuantity Mehod");
		return quantity;
	}

	public void setQuantity(int quantity) {
		// System.out.println("Inside setQuantity Mehod");
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
