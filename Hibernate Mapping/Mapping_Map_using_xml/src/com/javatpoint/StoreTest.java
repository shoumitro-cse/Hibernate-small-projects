
package com.javatpoint;

import java.util.HashMap;    
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
import org.hibernate.cfg.Configuration;
  
  
public class StoreTest {    
    
public static void main(String[] args) {    
//   
//        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
//        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
//
//        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
//        Session session=factory.openSession();  
//
//        Transaction t=session.beginTransaction(); 
//        
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         Transaction tx = session.beginTransaction();
        

        HashMap<String,String> map1=new HashMap<String,String>();    
        map1.put("Java is a programming language","John Milton");    
        map1.put("Java is a platform","Ashok Kumar");    

        HashMap<String,String> map2=new HashMap<String,String>();    
        map2.put("Servlet technology is a server side programming","John Milton");    
        map2.put("Servlet is an Interface","Ashok Kumar");    
        map2.put("Servlet is a package","Rahul Kumar");    

        Question question1=new Question("What is Java?","Alok",map1);    
        Question question2=new Question("What is Servlet?","Jai Dixit",map2);    

        session.persist(question1);    
        session.persist(question2);    

        tx.commit();    
        session.close(); 
        factory.close();
        System.out.println("successfully stored");    
    }    
}