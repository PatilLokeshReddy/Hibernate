package com.Employee.Employee_Details;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	public static void main( String[] args )
	{
		Configuration conf=new Configuration().configure().addAnnotatedClass(EmpDetails.class);
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sf=conf.buildSessionFactory(sr);
		Session s=sf.openSession();
		Query qry=s.createQuery("select name,Dept,Sal from EmpDetails where id=10");
		Object[] e=(Object[]) qry.uniqueResult();
		for(Object o:e)
		{	
			System.out.println(o);
		}
		s.beginTransaction();
		s.getTransaction().commit();
	}
}
