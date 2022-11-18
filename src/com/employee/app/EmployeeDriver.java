package com.employee.app;

public class EmployeeDriver {

	public static void main(String[] args) {

		EmployeeDao employeeRepository = new EmployeeDaoImpl();
		// create
		Boolean isEmployeeAdded = false;
		// isEmployeeAdded = employeeRepository.addEmployee(new Employee(10, "name 10",
		// 10000.0));
		if (isEmployeeAdded == true)
			System.out.println("Employee added.");
		else
			System.out.println("Employee could't be added.");
		// read
		Employee foundEmp = employeeRepository.getEmployee(11);
		if (foundEmp != null)
			System.out.println("Employee found:" + foundEmp);
		else
			System.out.println("Employee could not be found for id.");
		// update

		boolean isUpdated = employeeRepository.updateEmployee(new Employee(1, "GL India", 25000.0));

		if (isUpdated == true) {
			System.out.println("Employee Updated:");
			System.out.println("Updated employee:" + employeeRepository.getEmployee(1));
		} else
			System.out.println("Employee could not be updated .");

		// delete

		boolean isDeleted = employeeRepository.deleteEmployee(1);

		if (isDeleted== true) {
			System.out.println("Employee deleted");
			
		} else
			System.out.println("Employee could not be deleted .");
		
		// get all emp
		System.out.println("List of all emps:");
		System.out.println(employeeRepository.getAllEmployees());
	}

}
