/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.annotation_ex;

import com.javatpoint.xml_ex.*;
import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author suse
 */
public class ShowData {
    public static void main(String[] args) {
        
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         Transaction tx = session.beginTransaction();
         
        TypedQuery query=session.createQuery("from Question");    
        List<Question> list=query.getResultList();    

        Iterator<Question> itr=list.iterator();  
        
        while(itr.hasNext()){    
            Question q=itr.next();    
            System.out.println("Question Name: "+q.getQname());    
            System.out.println("Question Id: "+q.getId()+"\n");    

            //printing answers    
            List<Answer> list2=q.getAnswers();    
            Iterator<Answer> itr2=list2.iterator();    
           while(itr2.hasNext())  
           {  
            Answer a=itr2.next();  
                System.out.println(a.getAnswername()+":"+a.getPostedBy());  
            }    
        }  
         
        tx.commit();    
        session.close(); 
        factory.close();
    }
}
