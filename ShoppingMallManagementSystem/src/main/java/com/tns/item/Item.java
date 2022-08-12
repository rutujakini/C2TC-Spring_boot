package com.tns.item;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item{
	private long id;
	private String name;
	private  LocalDate manufactuing;
	private  LocalDate expiry;
	private String category;
	private	float price;

	public Item()
	{	
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getManufactuing() {
		return manufactuing;
	}

	public void setManufactuing(LocalDate manufactuing) {
		this.manufactuing = manufactuing;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufactuing=" + manufactuing + ", expiry=" + expiry
				+ ", category=" + category + ", price=" + price + "]";
	}
}
	