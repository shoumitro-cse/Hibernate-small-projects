/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_pack;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author suse
 */
public class StudentDataManage {

    // . It holds second level cache (optional) of data. 
    private static SessionFactory factory;

    public static void main(String[] args) {

        factory = StudentHibernateUtil.getSessionFactory();
        addStudent();
        find();

    }

    public static void addStudent() {
        //  It holds a first-level cache (mandatory) of data
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(4001, "Sohal", "Hossain", 20);

        session.save(student);
        tx.commit();

        session.close();
    }

    public static void find() {

        Session session = factory.openSession();
        // Transaction  tx = session.beginTransaction();
        List books = session.createQuery("FROM Student").list();

        for (Iterator iterator = books.iterator(); iterator.hasNext();) {

            Student auth = (Student) iterator.next();

            System.out.println("\nId : " + auth.getId());
            System.out.print("Name : " + auth.getFirstName());
            System.out.println(" " + auth.getLastName());
            System.out.println("Age : " + auth.getAge());
            System.out.println(".......................");
        }
        session.close();
        factory.close();
    }

}
