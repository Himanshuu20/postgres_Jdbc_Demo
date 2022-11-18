package com.employee.app;

import java.util.List;

public interface EmployeeDao {
	
	//CRUD
	
	Boolean addEmployee(Employee newEmployee);
	Employee getEmployee(Integer employeeId);
	Boolean updateEmployee(Employee updateEmployee);// update all attributes except id
	Boolean updateEmployeeName(Integer employeeId,String name);
	Boolean deleteEmployee(Integer employeeId);
	List<Employee> getAllEmployees();
	Boolean updateEmployeeSalary(Integer employeeId,String name);
	
}
