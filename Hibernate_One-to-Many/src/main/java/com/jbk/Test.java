package com.jbk;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();

		Address address1 = new Address(1, "pune", "MH", "Pune", 414603);
		Address address2 = new Address(2, "mumbai", "MH", "Mumbai", 000001);
		Set<Address> set = new HashSet<Address>();
		set.add(address1);
		set.add(address2);

		Employee employee = new Employee(01, "aa", "HR", 123456, set);

		session.save(employee);
		session.beginTransaction().commit();
		System.out.println("Done");

	}

}
