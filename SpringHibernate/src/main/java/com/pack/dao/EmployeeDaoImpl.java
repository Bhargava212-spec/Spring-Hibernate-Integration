package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertEmployee(Employee emp) {
		logger.info("Inside insertEmployee() dao");
		sessionFactory.getCurrentSession().save(emp);
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		logger.info("Inside insertEmployee1() dao");
		Query query=sessionFactory.getCurrentSession().createQuery("select e from Employee e");
		List elist=query.list();
		return elist;
	}

	@Override
	public void deleteEmployee(int empId) {
		logger.info("Inside insertEmployee2() dao");
		Employee emp =(Employee)sessionFactory.getCurrentSession().get(Employee.class, empId);
		sessionFactory.getCurrentSession().delete(emp);
		
		//Query q=sessionFactory.getCurrentSession
		//createQuery("delete from Employee e where e.employee"
		
	}

	@Override
	public Employee fetchEmployeeById(Integer empId) {
		logger.info("Inside insertEmployee3() dao");
		Employee emp=(Employee)sessionFactory.getCurrentSession().get(Employee.class, empId);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		logger.info("Inside insertEmployee4() dao");
		sessionFactory.getCurrentSession().update(emp);
		
	}
}
