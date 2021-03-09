package com.javatpoint.set_ex;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public static void main(String[] args) {
        
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata  meta = new MetadataSources(ssr).getMetadataBuilder().build();       
//        SessionFactory factory =  meta.buildSessionFactory();
       
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

         Session session = factory.openSession();

         Transaction tx = session.beginTransaction();
        
        Set<String> list1=new HashSet<String>();    
        list1.add("Java is a programming language");    
        list1.add("Java is a platform");    
        list1.add("Java is a Popular Language");    
        list1.add("Java is a Fun");    

        Set<String> list2=new HashSet<String>();    
        list2.add("Servlet is an Interface");    
        list2.add("Servlet is an API"); 
        list2.add("Servlet is a Web API"); 
        list2.add("Servlet is Fun"); 
        
         com.javatpoint.set_ex.Question q = new  com.javatpoint.set_ex.Question("What is Java?", list1);
         com.javatpoint.set_ex.Question q2 = new  com.javatpoint.set_ex.Question("What is Servlet?", list2);
        
        session.persist(q);
        session.persist(q2);
        
        tx.commit();    
        session.close();  
        factory.close();
        System.out.println("success");   
    }
 
}
