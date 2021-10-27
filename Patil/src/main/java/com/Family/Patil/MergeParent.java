package com.Family.Patil;

import java.time.zone.ZoneRulesProvider;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MergeParent 
{
	public static void main( String[] args )
	{
		//		Cars c=new Cars();
		//		c.setModelNum(105);
		//		c.setCarName("Lamborghini Urus");
		//		c.setColor("Grey");
		//		c.setPrice(3570000);
		//
		//		Persons p=new Persons();
		//		p.setpNum(5);
		//		p.setName("Gowtham");
		//		p.setInCome(540000);
		//		p.getCar().add(c);
		//		c.getPer().add(p);

		Configuration conf=new Configuration().configure().addAnnotatedClass(Persons.class).addAnnotatedClass(Cars.class);
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sf=conf.buildSessionFactory(sr);
		Session s=sf.openSession();
		s.beginTransaction();
		//		s.save(c);
		//		s.save(p);
		Persons per=(Persons) s.get(Persons.class, 1);
		Cars cr=(Cars) s.get(Cars.class, 101);
		s.getTransaction().commit();
		System.out.println(per);
		System.out.println(cr);
	}
}
