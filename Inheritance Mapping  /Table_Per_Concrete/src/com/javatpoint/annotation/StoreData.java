/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
        static int g =100 ;
    public static void main(String[] args) {
        
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata  meta = new MetadataSources(ssr).getMetadataBuilder().build();       
//        SessionFactory factory =  meta.buildSessionFactory();
       
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

         Session session = factory.openSession();

         Transaction tx = session.beginTransaction();

         Employee e1 = new Employee();
      //  e1.setId(g);
        e1.setName("Shoumitro");
        g++;
        Regular_Employee re = new Regular_Employee();
        re.setName("Shumit roy");
        re.setSalary(40000.0f);
        re.setBonus(5000);
      //   re.setId(g);
        g++;
        
        Contract_Employee ce = new Contract_Employee();
        ce.setName("Rohit roy");
        ce.setPay_per_hour(1000.0f);
        ce.setContract_duration("2 hours");
       //   ce.setId(g);
          g++;
        session.save(e1);
        session.save(re);
        session.save(ce);


        tx.commit();
         
         System.out.println("successfully saved"); 

         session.close();
        factory.close();
        
    }
   
}
