/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authors_pack;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author suse
 */
public class AuthorDataShow {
    
    public static void main(String[] args) {
        
       SessionFactory factory =  AuthorHibernateUtil.getSessionFactory();
       Session session = factory.openSession();
       //Transaction  tx = session.beginTransaction();
 
         List books = session.createQuery("FROM Authors").list();

        for (Iterator iterator =books.iterator(); iterator.hasNext();) {
            
                Authors auth = (Authors) iterator.next();

                System.out.println("\nId : " + auth.getId());
                System.out.println("Name : " + auth.getName());
                System.out.println("Age : " + auth.getAge());
                System.out.println(".......................");
          }
        
         session.close();
        factory.close();
    }
}
