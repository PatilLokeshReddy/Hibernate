package com.Aadhaar.Person;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
    {
    	
    	AadhaarDetails ad=null;
//    	PersonDetails pd=new PersonDetails();
//    	pd.setpNO(3);
//    	pd.setName("Thor");
//    	pd.setdOfBirth("13/08/1908");
//    	pd.setGender("Male");
//    	pd.setPNum(9078000000l);
//    	ad.setAdNumber(00000000000000001l);
//    	ad.setAddress("Tunder,Narpala");
//    	ad.setPinCode(515004);
//    	ad.setState("Andhra Pradesh");
//    	ad.setpDetails(pd);
    	
    	Configuration conf=new Configuration().configure().addAnnotatedClass(PersonDetails.class).addAnnotatedClass(AadhaarDetails.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
    	SessionFactory sf=conf.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	s.beginTransaction();
    	ad=(AadhaarDetails) s.get(AadhaarDetails.class, 732834878598l);   
    	System.out.println(ad);
    	s.getTransaction().commit();
    	s.close();
    	Session s2=sf.openSession();
    	s2.beginTransaction();
    	ad=(AadhaarDetails) s2.get(AadhaarDetails.class, 732834878598l);
    	System.out.println(ad);
    	s2.getTransaction().commit();
    	s2.close();
    	
    	
    	
    }
}