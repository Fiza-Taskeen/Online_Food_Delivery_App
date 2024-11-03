package com.tap.model;

public class Menu {
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String description;
	private float price;
	private boolean isAvailable;
	
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	public Menu(int menuId, int restaurantId, String itemName, String description, float price, boolean isAvailable) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	
	
	public Menu() {
		super();
	}
	
	
	
	
	@Override
	public String toString() {
		return menuId + "  " + restaurantId + "  " + itemName + "  " 
				+ description + "  " + price + "  "  + isAvailable;
	}
	
	
	
	
	
	
	
	
	
	
	
}
