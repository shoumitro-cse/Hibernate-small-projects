package com.javatpoint.mypackage;    
    
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
//import org.hibernate.Transaction;  
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {  
    
     //Session (extends)=> EntityManager  // it contain first level cache
    //SessionFactor (extends)=> EntityManagerFactory  // it contain second level cache
    public static void main(String[] args) {   
        
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
//        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
//          
//        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

         Session session = factory.openSession();
         session.getTransaction().begin();
        // Transaction tx = session.beginTransaction();
        
         Employee  e1=new Employee();    
            e1.setId(100);    
            e1.setFirstName("Gaurav");    
            e1.setLastName("Chawla");   
            e1.setAge(22);

         session.save(e1);
         session.getTransaction().commit();
       //  tx.commit();
         
         System.out.println("successfully saved"); 

         session.close();
        factory.close();

    }    
}


