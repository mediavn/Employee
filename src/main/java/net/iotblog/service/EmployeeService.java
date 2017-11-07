package net.iotblog.service;

import java.util.List;

import net.iotblog.model.Employee;

public interface EmployeeService {
	
	Iterable<Employee> findAll();
	
	List<Employee> search(String q);
	
	Employee findOne(int id);
	
	void save(Employee contact);
	
	void delete(int id);
}