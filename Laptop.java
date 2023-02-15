package com.onesoft.day14;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private boolean isTouchScreen;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	
	public Laptop(String brand, int price, String color, boolean isTouchScreen) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isTouchScreen = isTouchScreen;
	}

	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", color=" + color + ", isTouchScreen=" + isTouchScreen + "]";
	}
	
	

}
