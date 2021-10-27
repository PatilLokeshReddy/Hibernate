package com.Panther.Families;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Family 
{
	public static void main( String[] args )
	{
		Scanner sc=new Scanner(System.in);
		Families f=new Families();
		System.out.println("First Name");
		f.setFirstName(sc.next());
		System.out.println("Middle Name");
		f.setMiddleName(sc.next());
		System.out.println("Last Name");
		f.setLastName(sc.next());
		PantherFamilies pf=new PantherFamilies();
		System.out.println("Enter Person Id");
		pf.setId(sc.nextInt());
		pf.setpName(f);
		System.out.println("Enter Person Age");
		pf.setAge(sc.nextInt());
		Configuration con=new Configuration().configure().addAnnotatedClass(PantherFamilies.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		s.save(pf);
		Transaction t=s.beginTransaction();
		t.commit();
	}
}
