package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure();	
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
//		Employee e=new Employee();
//		e.setId(1);
//		e.setName("Bhargava");
//		e.setSalary(25000.0);
//        s.persist(e);
//		t.commit();
//		System.out.println("Inserted");
//		s.close();
		
		Employee e = (Employee)s.get(Employee.class, 1);
		System.out.println(e.getName());
		t.commit();
		s.close();
		
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		Employee e1 = (Employee)s1.get(Employee.class, 1);
		System.out.println(e1.getName());
		t1.commit();
		s1.close();
	}

}