package com.pack.service;

import java.util.List;

import com.pack.model.Employee;

public interface EmployeeService {
	public void insertEmployee(Employee emp1);
	public List<Employee> fetchAllEmployee();
	public void deleteEmployee(int empId);
	public Employee fetchEmployeeById(Integer empId);
	public void updateEmployee(Employee emp);
}
