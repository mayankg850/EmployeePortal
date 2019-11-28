package com.example.EmployeeService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeService.model.Employee;
import com.example.EmployeeService.repository.IEmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	IEmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAllByOrderByFirstNameAsc();
	}

}
