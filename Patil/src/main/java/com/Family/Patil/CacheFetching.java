package com.Family.Patil;

import javax.persistence.Cacheable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class CacheFetching {
	public static void main(String[] args) {
		Persons per=null;
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
		per=(Persons) s.get(Persons.class, 1);
		System.out.println(per);
		s.getTransaction().commit();
		s.close();
		Session s1=sf.openSession();
		s1.beginTransaction();
		per=(Persons) s1.get(Persons.class, 1);
		System.out.println(per);
		s1.getTransaction().commit();
		s1.close();
	}
}
