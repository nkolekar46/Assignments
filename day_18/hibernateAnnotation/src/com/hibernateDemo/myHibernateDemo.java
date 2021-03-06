package com.hibernateDemo;

import java.util.List;

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
	
	public List getEmployee()
	{
		List l=null;
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		
		Address a = new Address(854,"Kolhapur");
		session.save(a);
		
		Query q= session.createQuery("from Address");
		List l1 = q.list();
		System.out.println(l1);
		
		Query q1= session.createQuery("from Employee");
		List l2 = q1.list();
		System.out.println(l2);
		tx.commit();

		session.close();
		factory.close();	
		
		return l;
		
	}
}
