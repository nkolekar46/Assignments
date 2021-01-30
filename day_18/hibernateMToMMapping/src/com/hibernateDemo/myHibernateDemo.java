package com.hibernateDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class myHibernateDemo {
	
	/*public List getEmployee()
	{
		List l=null;
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();

		Criteria c= session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary", 40000));
		l=c.list();
		System.out.println(l);
	
		tx.commit();

		session.close();
		factory.close();	
		
		return l;
		
	}*/
	
	public Set<Address> getEmployee()
	{
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
//many address for ram   index will be generated according to addresses you have added
		Address a = new Address(416022, "Kolhapur");
		Address a1 = new Address(416023, "karad");
		Address a2= new Address(416054, "satara");
	
		//Elements will be added according to you have writting here
		Set<Address> l1 = new HashSet<Address>();
		l1.add(a);
		l1.add(a1);
		l1.add(a2);
	
		//one employee 
		Employee e = new Employee(75, "raj", 55000, l1);
		
		session.save(e);
		tx.commit();

		session.close();
		factory.close();	
		
		return l1;
		
	}
}
