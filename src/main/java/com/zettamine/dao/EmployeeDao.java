package com.zettamine.dao;

import java.util.List;

import com.zettamine.model.Employee;

public interface EmployeeDao {
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(int id);

}
