package net.iotblog.repository;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

import net.iotblog.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	List<Employee> findByNameContaining(String q);
}