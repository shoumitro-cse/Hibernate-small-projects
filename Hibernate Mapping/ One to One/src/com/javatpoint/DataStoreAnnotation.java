
package com.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DataStoreAnnotation {
    
    public static void main(String[] args) {
        
        
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("anno.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();   
    
    Employee e1  = new Employee();
    e1.setName("Rahim");
    e1.setEmail("aaa@gmail.com");
    
    Address address1=new Address();    
    address1.setAddressLine1("G-21,Lohia nagar");    
    address1.setCity("Jessore");    
    address1.setState("UP");    
    address1.setCountry("BD");    
    address1.setPincode(201301);    
    
    e1.setAddress(address1); // first insert address  then  emp
    address1.setEmployee(e1); // update address column join_emp null to value
    
    
    session.persist(e1);
    
    t.commit();
    session.close();
    factory.close();
      
    }
}
