
package com.javatpoint.list_ex;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
        static int g =100 ;
    public static void main(String[] args) {
        
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata  meta = new MetadataSources(ssr).getMetadataBuilder().build();       
//        SessionFactory factory =  meta.buildSessionFactory();
       
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

         Session session = factory.openSession();

         Transaction tx = session.beginTransaction();
        
        ArrayList<String> list1=new ArrayList<String>();    
        list1.add("Java is a programming language");    
        list1.add("Java is a platform");    
        list1.add("Java is a Popular Language");    
        list1.add("Java is a Fun");    

        ArrayList<String> list2=new ArrayList<String>();    
        list2.add("Servlet is an Interface");    
        list2.add("Servlet is an API"); 
        list2.add("Servlet is a Web API"); 
        list2.add("Servlet is Fun"); 
        
        Question q = new Question("What is Java?", list1);
        Question q2 = new Question("What is Servlet?", list2);
        
        session.persist(q);
        session.persist(q2);
        
        tx.commit();    
        session.close();  
        factory.close();
        System.out.println("success");   
    }
 
}
