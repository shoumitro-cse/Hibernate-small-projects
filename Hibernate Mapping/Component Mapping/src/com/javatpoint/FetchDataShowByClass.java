package com.javatpoint;    
import java.util.Iterator;    
import java.util.List;  
import javax.persistence.*;
import javax.persistence.TypedQuery;    
import org.geolatte.geom.crs.Projection;
import org.hibernate.*;    
import org.hibernate.SessionFactory;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;   
import org.hibernate.criterion.Projections;
    
public class FetchDataShowByClass { 
    
    public static void main(String[] args) {  

        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  

    //    TypedQuery query=session.createQuery("from Employee e");    
    //    List<Employee> list=query.getResultList();

//        Criteria c=  session.createCriteria(Employee.class);//passing Class class argument  
//      //  c.setFirstResult(1);
//     // c.setProjection(Projections.property("name"));
//        List list=c.list();  
//
         TypedQuery query = session.getNamedQuery("find_name");    
          query.setParameter("name","Shoumitro Roy");   
          List<Employee> list = query.getResultList();   

        Iterator<Employee> itr = list.iterator();    

        while(itr.hasNext()) {  

             Employee emp=itr.next();    
   
             System.out.println(emp.getId()+" "+emp.getName()); 
             
             Address address=emp.getAddress();    
             System.out.println(address.getCity()+" "+address.getCountry()+" "+address.getPincode());          
        }    

        session.close();
        
        Session session2=factory.openSession(); 
        
        Employee emp2=(Employee)session2.load(Employee.class,1);    
        System.out.println("\n"+emp2.getId()+" "+emp2.getName());  
        

        System.out.println("success");    
        factory.close();
    }    
}  