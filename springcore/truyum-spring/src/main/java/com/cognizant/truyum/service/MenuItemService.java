package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

@Component
public class MenuItemService {

	@Autowired
	private MenuItemDao menuItemDao;

	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}

	public List<MenuItem> getMenuItemListAdmin() {
		return null;
	}

	public List<MenuItem> getMenuItemListCustomer() {
		return null;
	}

	public MenuItem getMenuItem(long menuItemId) {
		return null;
	}

	public void editMenuItem(MenuItem menuItem) {

	}
}
