package com.employee.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// class to implement to data access logic with PostGres 
public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoImpl() {
		super();
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "admin");
			System.out.println("PostGres connection successful !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Boolean addEmployee(Employee newEmployee) {

		Boolean isRecordAdded = false;
		String sql = "INSERT INTO employee(id,name,salary) VALUES(?,?,?)";
		// Prepared statement to construct dynamic query
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
			preparedStatement.setInt(1, newEmployee.getId());
			preparedStatement.setString(2, newEmployee.getName());
			preparedStatement.setDouble(3, newEmployee.getSalary());
			System.out.println("prepared statement:" + preparedStatement);
			int recordCount = preparedStatement.executeUpdate();
			if (recordCount == 1)
				isRecordAdded = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isRecordAdded;
	}

	@Override
	public Employee getEmployee(Integer employeeId) {

		String sql = "SELECT id,name,salary FROM employee WHERE id = ?";
		Employee foundEmployee = null;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
			preparedStatement.setInt(1, employeeId);
			ResultSet result = preparedStatement.executeQuery();
			if (result.next()) {
				foundEmployee = new Employee(result.getInt("id"), result.getString("name"), result.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return foundEmployee;
	}

	@Override
	public Boolean updateEmployee(Employee updateEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEmployeeName(Integer employeeId, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
