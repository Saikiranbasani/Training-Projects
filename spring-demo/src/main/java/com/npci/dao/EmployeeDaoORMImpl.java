package com.npci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;

//DriverManagerDatasource>>LocalSessionFactoryBean>>HibernateTemplate>>EmployeeDaoORMImpl
//Spring container must create this Dao object & supply the HibernateTemplate
//<bean id="dao" class="com.npci.dao.EmployeeDaoORMImpl">
//<property name="template" ref ="hibernateTemplateBean">
@Repository
public class EmployeeDaoORMImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate template; //generate setters


	@Override
	
	public Employee save(Employee employee) {
		// save method returns a Serializable id that is generated
		int id=(int)template.save(employee);
		//now using the id you can get the employee 
		return template.get(Employee.class, id);
	}

	@Override
	public Employee findbyId(int id) {
		//select * from employee where primary key=idValue
		return template.get(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		// loadAll() -> select* from employee->each record is added as an employee in the List
		return template.loadAll(Employee.class);
	}

	@Override
	
	public void delete(int id) {
		// 
		Employee employee=findbyId(id);
		if(employee!=null) {
			template.delete(employee);
		}
		
	}
	
}
