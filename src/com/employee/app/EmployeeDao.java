package com.employee.app;

public interface EmployeeDao {
	//CRUD
	
	Boolean addEmployee(Employee newEmployee);
	Employee getEmployee(Integer employeeId);
	Boolean updateEmployee(Employee updateEmployee);// update all attributes except id
	Boolean updateEmployeeName(Integer employeeId,String name);
	Boolean deleteEmployee(Integer employeeId);
}
