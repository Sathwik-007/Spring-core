package com.sathwik.spring.springcore.assignment;

public class ShoppingCart {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}
	
	public void hi() {
		System.out.println("Constructor");
	}
	
	public void bye() {
		System.out.println("Destructor");
	}
}
