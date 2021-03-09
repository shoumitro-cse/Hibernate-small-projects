
package com.javatpoint;

import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData {
    
    public static void main(String[] args) {
        
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  

        Transaction t=session.beginTransaction();   

         TypedQuery query=session.createQuery("from Employee e");    
         List<Employee> list=query.getResultList();    

         Iterator<Employee> itr=list.iterator();  
         
         while(itr.hasNext()) { 
             
            Employee emp=itr.next();    
            System.out.println(emp.getEmployeeId()+" "+emp.getName()+" "+emp.getEmail()); 
            
            Address address=emp.getAddress();    
            
            System.out.println(address.getAddressId()+" "+address.getAddressLine1()+" "+address.getCity()+" "+    
               address.getState()+" "+address.getCountry()+" "+address.getPincode());    
         }    


        t.commit();
        session.close();
        factory.close();
    }
}
