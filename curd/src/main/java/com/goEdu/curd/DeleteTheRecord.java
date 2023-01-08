package com.goEdu.curd;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTheRecord {

		public static void main(String[] args) {
			Configuration cf= new Configuration().configure();
	        SessionFactory sf=cf.buildSessionFactory();
	        Session ss=sf.openSession();
	        Query q1=ss.createQuery("delete from Emplooye where sid=:sid");
	        q1.setParameter("sid",380);
	        Transaction tr=ss.beginTransaction();
	        int r=q1.executeUpdate();
	        tr.commit();
	       System.out.println("number of rows affected :"+r);
	       ss.close();
	       sf.close();
		}
}
