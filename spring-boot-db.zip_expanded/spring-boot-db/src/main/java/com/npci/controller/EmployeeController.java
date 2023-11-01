package com.npci.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.beans.Employee;
import com.npci.exceptions.EmployeeNotFoundException;
import com.npci.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	//controller depends on the service layer hence autowire the EmployeeService
	@Autowired
	private EmployeeService service;
	//a string of exceptions
	private List<String> exceptionList=new ArrayList<>();
	
	@GetMapping(path="/employees/searchByName/{name}")
	public ResponseEntity<Object> getEmployees(@PathVariable("name") String name){
		List<Employee> employees = service.findEmployeesByName(name);
		return ResponseEntity.status(200).body(employees);
	}
	
	@GetMapping(path="/employees")
	public ResponseEntity<Object> getAllEmployees(){
		List<Employee> employees=service.findEmployees();
		//adding employees in the response body-spring boot automatically converts
		//List or any objects to JSON format
		return ResponseEntity.status(200).body(employees);
	}

	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Object> getAllEmployees(@PathVariable("id") int id) {
		try {
			Employee employee=service.findEmployee(id);
			return ResponseEntity.status(200).body(employee);
		} catch(EmployeeNotFoundException ex) {
			exceptionList.add(ex.getMessage()); //adding exceptions to the collection
			Map<String,String> errors=new HashMap<>();
			errors.put("error", ex.getMessage()); // to see the exception message for the current 
			return ResponseEntity.status(404).body(errors);
		}
	}
	// import MediaType from org.springframework
	@PostMapping(path="/employees",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeEmployee(@RequestBody Employee employee){
		//json properties are automatically mapped to employee properties when the names are same
		Employee created=service.createEmployee(employee);
		return ResponseEntity.status(201).body(created);
	}
	
}
