package com.example.EmployeeService.controller;

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

import com.example.EmployeeService.model.Employee;
import com.example.EmployeeService.service.EmployeeService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class EmployeeControllerTest {

	@Mock
	EmployeeService employeeService;
	
	@InjectMocks
	EmployeeController employeeController;
	
	@Test
	void addEmployeeTest() {
		Employee emp = new Employee(1,"Mayank","gupta","01-jan-1996","male","IT");
		Mockito.doReturn(emp).when(employeeService).addEmployee(emp);
		assertEquals(emp, employeeController.addEmployee(emp));
	}
	
	@Test
	void getAllEmployeeTest() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp = new Employee(1,"Mayank","gupta","01-jan-1996","male","IT");
		list.add(emp);
		Mockito.doReturn(list).when(employeeService).getAllEmployee();
		assertEquals(list, employeeController.getAllEmployee());
	}

}
