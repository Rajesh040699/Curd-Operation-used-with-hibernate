package com.goEdu.curd;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Configuration cf= new Configuration().configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session ss=sf.openSession();
        Query q1=ss.createQuery(" update Emplooye set name='Priyakar' where sid=356");
        Transaction tr= ss.beginTransaction();      
        int r =q1.executeUpdate(); 
        tr.commit();
        System.out.println("inerted data "); 
        System.out.println("number of rows affected :"+r);
        ss.close();
       
	}
}
