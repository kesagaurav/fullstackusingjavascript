package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Employee;
import com.gaurav.service.EmpService;

@RestController
@CrossOrigin("http://127.0.0.1:5500/")
public class EmployeeController {
	@Autowired
	private EmpService service;

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee e) {
		return service.createEmployee(e);
	}

	@GetMapping("/employees")
	List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

}
