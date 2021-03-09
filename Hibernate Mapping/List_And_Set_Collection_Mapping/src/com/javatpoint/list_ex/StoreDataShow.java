
package com.javatpoint.list_ex;


import javax.persistence.TypedQuery;  
import java.util.*;  
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class StoreDataShow {
        static int g =100 ;
    public static void main(String[] args) {
        
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
        
//    TypedQuery query=session.createQuery("from  Question ");    
//    List<Question> list=query.getResultList();   
//        
//    Iterator<Question> itr=list.iterator();    
//    while(itr.hasNext()){    
//        Question q=itr.next();    
//        System.out.println("Question Id: "+q.getId());    
//        System.out.println("Question Name: "+q.getQname());    
//            
//        //printing answers    
//        List<String> list2=q.getAnswar();    
//        Iterator<String> itr2=list2.iterator();    
//        while(itr2.hasNext()){    
//            System.out.println(itr2.next());    
//        }          
//    }      

         List question = session.createQuery("FROM  Question").list();
      
         for (Iterator iterator =question.iterator(); iterator.hasNext();) {
             
                Question q = (Question) iterator.next();
                System.out.println("\n.......... Question .........");
                System.out.println("Question  : " + q.getQname());
                System.out.println("Id : " + q.getId());
                
                System.out.println(".......... Answar .........");
                
                List<String> list2=q.getAnswar();    
                Iterator<String> itr2=list2.iterator();   
                
                while(itr2.hasNext()){    
                    System.out.println("ans : "+itr2.next());    
                }
                
                System.out.println(".......................\n\n");
          }
  
        session.close();  
        factory.close();
        System.out.println("success");   
    }
 
}