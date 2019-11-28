package com.example.EmployeeService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeService.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findAllByOrderByFirstNameAsc();
}
