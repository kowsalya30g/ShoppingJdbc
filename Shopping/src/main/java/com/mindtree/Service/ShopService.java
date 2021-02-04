package com.mindtree.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mindtree.dao.DaoImp;
import com.mindtree.entity.Item;
import com.mindtree.exception.DbFailed;

public class ShopService {
	Item i = new Item();
	static Scanner sc=new Scanner(System.in);
	public void add(Item i) {
		try {
			DaoImp.addToDb(i);
		} catch (DbFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(int quantity, String name) {
		try {
			DaoImp.updateToDb(quantity, name);
		} catch (DbFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try {
			DaoImp.delete(id);
		} catch (DbFailed e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public double calculateBill(String name, int quantity) {
		double cal = 0;
		try {
			List<Item> list = DaoImp.retreive();
			for (Item i : list) {
				if (i.getName().equals(name)) {
					cal = i.getPriceperitem() * i.getQuantity();
				}
			}

		} catch (DbFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cal;
	}

	public void display() {
		try {
			List<Item> list = DaoImp.retreive();
			System.out.println("Based on quantity");
			Collections.sort(list, (a, b) -> (int) (a.getQuantity() - b.getQuantity()));
			list.forEach(s -> System.out.println(i.getId() + " " + i.getName() + " " + i.getPriceperitem() + " " + i.getQuantity()));
			System.out.println("==================");

			System.out.println("Based on price");
			Collections.sort(list, (a, b) -> (int) (a.getPriceperitem() - b.getPriceperitem()));
			list.forEach(i -> System.out.println(i.getId() + " " + i.getName() + " " + i.getPriceperitem() + " " + i.getQuantity()));
		} 
		catch (DbFailed e) 
		{

			e.printStackTrace();
		} 
		catch (SQLException e)
		{

			e.printStackTrace();
		}
	}

}
