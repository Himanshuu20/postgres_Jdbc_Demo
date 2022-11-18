package com.employee.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "admin");
			System.out.println("PostGres connection successful !");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM employee");
			while(result.next()) {
				System.out.print(" id:"+result.getInt(1));
				System.out.print(" name:"+result.getString("name"));//result.getString(2)
				System.out.print(" salary:"+result.getDouble("salary"));//result.getDouble(3)
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
