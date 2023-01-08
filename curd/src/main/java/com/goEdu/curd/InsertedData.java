package com.goEdu.curd;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertedData {
	public static void main(String[] args) {
		Configuration cf= new Configuration().configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session ss=sf.openSession();
       Query q1=ss.createQuery("insert into Emplooye (sid,name,salary,dob) values (401,'raja',94749.03,'03-oct-1999')  select sid,name,salary,dob from Emplooye");
       int r=q1.executeUpdate();
       Transaction tr=ss.beginTransaction();
       tr.commit();
       System.out.println("number of rows affected :"+r);
       ss.close();
       sf.close();
	}
}
