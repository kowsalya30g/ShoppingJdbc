package com.mindtree.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.exception.DbFailed;

public class JdbcConnection {
	private static final String sql = "jdbc:mysql://localhost:3306/Shoppingcart";
	private static final String root = "root";
	private static final String password = "E6EE038@12345";

	public static Connection connect() throws DbFailed {
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(sql, root, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DbFailed("Database could not be connected");
		}

		return connection;
	}

	public static void closeConnection(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Statement s) {
		if (s != null) {
			try {
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
