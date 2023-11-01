package com.npci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;
import com.npci.exceptions.EmployeeNotFoundException;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao; //setter method to supply the object
	
	

	

	@Override
	@Transactional
	public List<Integer> createEmployees(Employee employee1, Employee... employees) {
			Employee e=dao.save(employee1);
			List<Integer> idList=new ArrayList<>();
			idList.add(e.getId());
			for(Employee emp:employees) {
				Employee e2=dao.save(emp);
				idList.add(e2.getId());
			}
		return idList;
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
	 return dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee employee=dao.findbyId(id);
		if(employee!=null) 
			return employee;
		throw new EmployeeNotFoundException("Id"+id+" not found");
		
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		Employee employee=findEmployee(id);
		dao.delete(employee.getId());
		
	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		List<Employee> employees=findEmployees();
		List<Employee> names=employees.stream().filter(item->item.getName().equals(name)).collect(Collectors.toList());
		return names;
	}

	@Override
	public List<Employee> findEmployees() {
		return dao.findAll();
	}

}
