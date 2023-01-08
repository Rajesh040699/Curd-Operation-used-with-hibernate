package com.goEdu.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
    Emplooye e1=new Emplooye();
    	e1.setSid(391);
    	e1.setName("Nishant");
    	e1.setDob("23-aug-1998");
    	e1.setSalary(475934.37);
    	Emplooye e2=new Emplooye();
    	e2.setSid(392);
    	e2.setName("Nisha");
    	e2.setDob("23-Oct-1998");
    	e2.setSalary(47594.37);
    
    	 Emplooye e3=new Emplooye();
        e3.setSid(393);
     	e3.setName("Nitin");
     	e3.setDob("23-Nov-1998");
     	e3.setSalary(473594.37);
    	 
    	 Emplooye e4=new Emplooye();
    	 e4.setSid(394);
      	e4.setName("Arvindra");
      	e4.setDob("23-Jun-1997");
      	e4.setSalary(446774.37);
     	 
    	Configuration cf= new Configuration().configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(e1);
        ss.save(e2);
        ss.save(e3);
        ss.save(e4);
        
        System.out.println( "Hello World!" );
        tr.commit();
      	ss.close();
      	sf.close();
        
    }
}
