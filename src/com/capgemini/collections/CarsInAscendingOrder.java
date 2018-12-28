package com.capgemini.collections;

public class CarsInAscendingOrder implements Comparable<CarsInAscendingOrder> {
	private String Brand;
	private String model;
	private int year;
	private double price;

	

	public CarsInAscendingOrder(String brand, String model, int year, double price) {
		super();
		setBrand(brand);
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cars [Brand=" + getBrand() + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}

	@Override
	public int compareTo(CarsInAscendingOrder car) {
		int value=this.getBrand().compareTo(car.getBrand());
		return value;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

}
