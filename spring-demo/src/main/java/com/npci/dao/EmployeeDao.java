package com.npci.dao;

import com.npci.beans.Employee;
import java.util.List;

public interface EmployeeDao {
	
	public Employee save(Employee employee);
	public Employee findbyId(int id);
	public List<Employee> findAll();
	public void delete(int id);

}
