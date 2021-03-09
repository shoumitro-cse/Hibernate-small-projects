package com.javatpoint;    


import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
     
public class StoreDataMxl { 
    
    public static void main(String[] args) {    

        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
        SessionFactory factory=meta.getSessionFactoryBuilder().build(); 
        
        Session session=factory.openSession();    
        Transaction t=session.beginTransaction();      
          
        Employee e1=new Employee();    
        e1.setName("Ravi Malik");    
        e1.setEmail("ravi@gmail.com");    

        Employee e2=new Employee();  
        e2.setName("Anuj Verma");  
        e2.setEmail("anuj@gmail.com");  

        Address address1=new Address();    
        address1.setAddressLine1("R.k-13,Sector 3");    
        address1.setCity("Jessore");    
        address1.setState("R.B");    
        address1.setCountry("Bangladesh");    
        address1.setPincode(7440);   
        


        e1.setAddress(address1);    
        e2.setAddress(address1); 
        
        

        session.persist(e1);    
        session.persist(e2);  

 
        t.commit();    
        session.close();    
       factory.close();
       
       System.out.println("success");    
    }    
}   