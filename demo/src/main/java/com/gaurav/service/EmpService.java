package com.gaurav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Employee;
import com.gaurav.repository.EmployeeRep;

@Service
public class EmpService {
	@Autowired
	public EmployeeRep rep;
	
	public Employee createEmployee(Employee e) {
		return rep.save(e);
	}
	
	public List<Employee> getAllEmployees() {
		return rep.findAll();
	}
}
