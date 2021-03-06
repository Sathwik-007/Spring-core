package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;

public class CartService {
	/*
	 * CartService -cartDao: CartDao +getAllCartItems(userId: long): List<MenuItem>
	 * raises CartEmptyException +setCartDao(cartDao: CartDao): void
	 * +addCartItem(userId: long, menuItemId: long): void +removeCartItem(userId:
	 * long, menuItemId: long): void
	 */
	@Autowired
	private CartDao cartDao;

	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		return null;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	public void addCartItem(long userId, long menuItemId) {

	}
	
	public void removeCartItem(long userId, long menuItemId) {
		
	}

}
