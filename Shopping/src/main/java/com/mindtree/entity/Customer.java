package com.mindtree.entity;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String name;
	private String phone;
	private LocalDate date;
	private double amount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phone, LocalDate date, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.amount = amount;
	}

	public Customer(int id, String name, String phone, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.date = date;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
