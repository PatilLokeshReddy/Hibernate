package com.Panther.PantherCar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Car 
{
    public static void main( String[] args )
    {
    	PantherCar pc=null;
    	Configuration con=new Configuration().configure().addAnnotatedClass(PantherCar.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	pc=(PantherCar) s.get(PantherCar.class, 3);
    	t.commit();
    	System.out.println(pc);
    }
}
