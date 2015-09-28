package com.mycompany.esm.dao;

import java.util.List;

import com.mycompany.esm.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);
	
	public List<Employee> listEmployees();
	public Employee getEmployee(Long id);
	
	public void deleteEmployee(Long id);
	
}