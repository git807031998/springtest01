package com.zhangjing.spring.helloworld;

public class Car {
	private String brand;
	private String crop;
	private Double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + "]";
	}
	
}
