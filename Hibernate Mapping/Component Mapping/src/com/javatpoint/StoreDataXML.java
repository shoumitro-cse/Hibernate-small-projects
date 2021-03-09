package com.javatpoint;    


import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.cfg.Configuration;
     
public class StoreDataXML { 
    
    public static void main(String[] args) {    

//        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
//        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
//        SessionFactory factory=meta.getSessionFactoryBuilder().build(); 
//        
        
      //  SessionFactory factory = new Configuration().configure().buildSessionFactory();
       // SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        SessionFactory factory = new Configuration().addResource("hibernate.cfg.xml").configure().buildSessionFactory();
        Session session=factory.openSession();    
        Transaction t=session.beginTransaction();      
       
        Employee e = new Employee();
        e.setName("Rohit Roy");
        
        Address ad = new Address();
        ad.setCity("Khulna");
        ad.setCountry("Bangladesh");
        ad.setPincode(7480);
       
         e.setAddress(ad);
         
         session.persist(e);
         
 
        t.commit();    
        session.close();    
       factory.close();
       
       System.out.println("success");    
    }    
}   