package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Employee;
@Repository
public interface EmployeeRep extends JpaRepository<Employee, Integer> {

}
