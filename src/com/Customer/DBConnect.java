package com.Customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//declare database connection informations
	private static String url = "jdbc:mysql://localhost:3306/online_transport_system";
	private static String user = "root";
	private static String pass = "Mysql123@";
	private static Connection con;
	
	
	//create database connection
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
		}
		
		catch (Exception e) {
			System.out.println("Database Connection Unsucess!");
		}
		
		return con;
	}

}
