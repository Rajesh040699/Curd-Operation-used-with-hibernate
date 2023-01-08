package com.goEdu.curd;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReteriveData {
	public static void main(String[] args) {
		Configuration cf= new Configuration().configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session ss=sf.openSession();
        Query q1=ss.createQuery("from emplooyes");
        List ls=q1.list();
        System.out.println("Number of row selected "+ls.size());
        Iterator itr=ls.iterator();
        while(itr.hasNext()) {
        	String name=(String)itr.next();
        	System.out.println(name);
        	
        }
        ss.close();
        sf.close();
	}
}
