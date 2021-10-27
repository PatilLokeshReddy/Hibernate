package com.Panther.Car;

import java.util.Scanner;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Car 
{
	public static void main( String[] args )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			PantherCar pc=new PantherCar();
			System.out.println("Enter Model Number");
			pc.setModelNum(sc.nextInt());
			System.out.println("Enter Name");
			pc.setName(sc.next());
			System.out.println("Enter Price");
			pc.setPrice(sc.nextInt());
			Configuration con =new Configuration().configure().addAnnotatedClass(PantherCar.class);
			ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf=con.buildSessionFactory();
			Session s=sf.openSession();
			Transaction ts=s.beginTransaction();
			s.save(pc);
			ts.commit();
		}
	}
}
