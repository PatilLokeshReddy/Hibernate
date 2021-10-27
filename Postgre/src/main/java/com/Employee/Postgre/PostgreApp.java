package com.Employee.Postgre;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class PostgreApp 
{
	public static void main( String[] args )
	{
		Car c=new Car();
		c.setCar_no(1);
		c.setCar_name("Volvo");
		c.setCar_price(12000000);
		
		Configuration conf=new Configuration().configure().addAnnotatedClass(Car.class);
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sf=conf.buildSessionFactory(sr);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(c);
		t.commit();
	}
}
