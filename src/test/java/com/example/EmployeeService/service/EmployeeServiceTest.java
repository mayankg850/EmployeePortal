package com.example.EmployeeService.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.EmployeeService.controller.EmployeeController;
import com.example.EmployeeService.model.Employee;
import com.example.EmployeeService.repository.IEmployeeRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class EmployeeServiceTest {

	@Mock
	IEmployeeRepository employeeRepository;
	
	@InjectMocks
	EmployeeService employeeService;
	
	@Test
	void addEmployeeTest() {
		Employee emp = new Employee(1,"Mayank","gupta","01-jan-1996","male","IT");
		Mockito.doReturn(emp).when(employeeRepository).save(emp);
		assertEquals(emp, employeeService.addEmployee(emp));
	}
	
	@Test
	void getAllEmployeeTest() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp = new Employee(1,"Mayank","gupta","01-jan-1996","male","IT");
		list.add(emp);
		Mockito.doReturn(list).when(employeeRepository).findAllByOrderByFirstNameAsc();
		assertEquals(list, employeeService.getAllEmployee());
	}

}
