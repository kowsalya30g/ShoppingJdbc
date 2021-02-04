package com.mindtree.entity;

public class Item {
	private int id;
	private String name;
	private double priceperitem;
	private int quantity;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double priceperitem, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.priceperitem = priceperitem;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceperitem() {
		return priceperitem;
	}

	public void setPriceperitem(double priceperitem) {
		this.priceperitem = priceperitem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", priceperitem=" + priceperitem + ", quantity=" + quantity + "]";
	}

}
