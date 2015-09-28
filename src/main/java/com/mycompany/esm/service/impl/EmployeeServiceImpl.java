package com.mycompany.esm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.esm.dao.EmployeeDao;
import com.mycompany.esm.model.Employee;
import com.mycompany.esm.model.Skill;
import com.mycompany.esm.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);

	}

	@Transactional(readOnly = true)
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployees();
	}

	@Transactional(readOnly = true)
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(id);
	}

	@Transactional
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}
	
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return employeeDao.getAllSkills();
	}

}
