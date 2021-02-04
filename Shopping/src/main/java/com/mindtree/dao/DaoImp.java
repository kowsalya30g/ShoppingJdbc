package com.mindtree.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.entity.Item;
import com.mindtree.exception.DbFailed;
import com.mindtree.utility.JdbcConnection;

public class DaoImp {

	public static void addToDb(Item i) throws DbFailed, SQLException {
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			String query = "INSERT into item values(?,?,?,?)";
			con = JdbcConnection.connect();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, i.getId());
			pst.setString(2, i.getName());
			pst.setDouble(3, i.getPriceperitem());
			pst.setInt(4, i.getQuantity());
			
			pst.executeUpdate();		
			con.close();
	

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			JdbcConnection.closeConnection(rs);
			JdbcConnection.closeConnection(statement);
			JdbcConnection.closeConnection(con);
		}
	}

	public static void updateToDb(int quantity, String name) throws DbFailed, SQLException {
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			con = JdbcConnection.connect();
			statement = con.createStatement();
			String sql = "update item set quantity=" + quantity + " where name='" + name + "'";
			JdbcConnection.closeConnection(rs);
			int row = statement.executeUpdate(sql);
			System.out.println("rows updated:" + row);
			rs = statement.executeQuery("select * from item");

		} finally {
			JdbcConnection.closeConnection(rs);
			JdbcConnection.closeConnection(statement);
			JdbcConnection.closeConnection(con);
		}

	}

	public static void delete(int id) throws DbFailed, SQLException {
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			con = JdbcConnection.connect();
			statement = con.createStatement();
			String sql = "delete from item where id=" + id;
			int row = statement.executeUpdate(sql);
			System.out.println("rows deleted:" + row);
			rs = statement.executeQuery("select * from item");

		} finally {
			JdbcConnection.closeConnection(rs);
			JdbcConnection.closeConnection(statement);
			JdbcConnection.closeConnection(con);
		}
	}

	public static List<Item> retreive() throws DbFailed, SQLException {
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		List<Item> s = new ArrayList<Item>();
		try {
			con = JdbcConnection.connect();
			statement = con.createStatement();
			rs = statement.executeQuery("select * from item");
			while (rs.next()) {
				s.add(new Item(rs.getInt(1), rs.getString(2), rs.getInt(3),
						rs.getInt(4)));

			}

		} finally {
			JdbcConnection.closeConnection(rs);
			JdbcConnection.closeConnection(statement);
			JdbcConnection.closeConnection(con);
		}

		return s;
	}

}
