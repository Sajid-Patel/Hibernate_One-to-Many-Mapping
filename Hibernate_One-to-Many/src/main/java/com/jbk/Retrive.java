package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Retrive {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee = session.get(Employee.class, 01);
		System.out.println(employee);
	}

}
