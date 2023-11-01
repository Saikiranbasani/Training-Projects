package com.npci.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.npci.beans.Employee;

public class EmployeeDaoListImpl implements EmployeeDao{
	
	private List<Employee> inMemory;
	public EmployeeDaoListImpl() {
		inMemory = new ArrayList<>();
	}

	@Override
	public Employee save(Employee employee) {
		
		employee.setId(inMemory.size()+1);// set the id based on the size
		inMemory.add(employee);
		return employee;
	}

	@Override
	public Employee findbyId(int id) {
		for(Employee employee:inMemory) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		return inMemory;
	}

	@Override
	public void delete(int id) {
		Iterator<Employee> iterator = inMemory.iterator();
		while(iterator.hasNext()) {
			Employee emp=iterator.next();
			if(emp.getId()==id) {
				iterator.remove();
				break;
			}
		}
		
	}
	
	

}
