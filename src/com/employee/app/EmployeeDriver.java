package com.employee.app;

public class EmployeeDriver {

	public static void main(String[] args) {

		EmployeeDao employeeRepository = new EmployeeDaoImpl();
		Boolean isEmployeeAdded = false;
		// isEmployeeAdded = employeeRepository.addEmployee(new Employee(10, "name 10",
		// 10000.0));
		if (isEmployeeAdded == true)
			System.out.println("Employee added.");
		else
			System.out.println("Employee could't be added.");
		Employee foundEmp = employeeRepository.getEmployee(11);
		if (foundEmp != null)
			System.out.println("Employee found:" + foundEmp);
		else
			System.out.println("Employee could not be found for id.");

	}

}
