package com.Users.Bike;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class BikeDao {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<=20;i++)
		{
			Bike_Model bm=new Bike_Model();
			bm.setBike_modelno(i);
			bm.setBike_name("Bike"+r.nextInt());
			bm.setBike_color("Color"+r.nextInt());
			Configuration conf=new Configuration().configure().addAnnotatedClass(Bike_Model.class);
			ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
			SessionFactory sf=conf.buildSessionFactory(sr);
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			s.save(bm);
			t.commit();
		}
		

	}
}
