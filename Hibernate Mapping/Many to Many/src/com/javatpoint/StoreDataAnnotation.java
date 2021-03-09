package com.javatpoint;    
import java.util.ArrayList;    
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
     
public class StoreDataAnnotation { 
    
    public static void main(String[] args) {    

        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hiber_annotation.cfg.xml").build();    
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
        SessionFactory factory=meta.getSessionFactoryBuilder().build(); 
        
        Session session=factory.openSession();    
        Transaction t=session.beginTransaction();      

        Answer an1=new Answer();  
        an1.setAnswername("Java is a programming language");  
        an1.setPostedBy("Ravi Malik"); 
        
        an1.setAns_id(100);

        Answer an2=new Answer();  
        an2.setAnswername("Java is a platform");  
        an2.setPostedBy("Sudhir Kumar");
        
        an2.setAns_id(101);

        Question q1=new Question();  
        q1.setQname("What is Java?");  
        ArrayList<Answer> l1=new ArrayList<Answer>();  
        l1.add(an1);  
        l1.add(an2);  
        q1.setAnswers(l1); 
        
        q1.setId(1);


         Answer ans3=new Answer();    
         ans3.setAnswername("Servlet is an Interface");    
         ans3.setPostedBy("Jai Kumar"); 
         
         ans3.setAns_id(102);

         Answer ans4=new Answer();    
         ans4.setAnswername("Servlet is an API");    
         ans4.setPostedBy("Arun");   
         
         ans4.setAns_id(103);

        Question q2=new Question();  
        q2.setQname("What is Servlet?");  
        ArrayList<Answer> l2=new ArrayList<Answer>();  
        l2.add(ans3);  
        l2.add(ans4);  
        q2.setAnswers(l2); 
        
        q2.setId(2);
       
        session.persist(an1);
        session.persist(an2);
        session.persist(ans3);
        session.persist(ans4);

        
        session.persist(q1);    
        session.persist(q2);    

        t.commit();    
        session.close();    
        System.out.println("success");    
       factory.close();
    }    
}   