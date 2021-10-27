package com.Users.Cars;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration().configure().addAnnotatedClass(Cars.class).addAnnotatedClass(Family.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
    	SessionFactory sf=conf.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	Random r=new Random();
    	for(int i=0;i<50;i++)
    	{
    		Cars c=new Cars();
        	c.setCar_name("Volvo"+" "+r.nextInt());
        	c.setCar_price(12500000+i*3);
    		Family f=new Family();
    		f.setId(i);
        	f.setName("Lokesh"+" "+r.nextInt());
        	f.setPh_no(9966078721l+i);
    		f.setCar(c);
    		s.save(c);
    		s.save(f);
    		
    	}
    	Transaction t=s.beginTransaction();
    	t.commit();
    }
}
