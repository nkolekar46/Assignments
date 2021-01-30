package com.demo.hibernatedemo;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MyDbConnection {

	public void insertEmployee() {
		Employee e = new Employee(12, "ABC", 22000);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();

		//session.save(e);

		Query q= session.createQuery("from Employee where empid>20000");
		List l = q.list();
		System.out.println(l);
	
		tx.commit();

		session.close();
		factory.close();

	}

}
