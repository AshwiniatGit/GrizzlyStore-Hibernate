package com.cts.grizzlystore.bean;

public class Product {
	private String id;
	private String category;
	private String name;
	private String description;
	private float price;
	private String brand;
	private float rating;
	private float offer;
	
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name=" + name + ", description=" + description
				+ ", price=" + price + ", brand=" + brand + ", rating=" + rating + ", offer=" + offer + "]";
	}

	public Product() {
		super();
	}
	

	public Product(String id, String category, String name, String description, float price, String brand, float rating,
			float offer) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
		this.rating = rating;
		this.offer = offer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getOffer() {
		return offer;
	}

	public void setOffer(float offer) {
		this.offer = offer;
	}
	
	


}
