package testPackage;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class ManageBooks {
   
   // . It holds second level cache (optional) of data. 
   private static SessionFactory factory;
   
   public static void main(String[] args) {
       
      factory = new Configuration().configure().buildSessionFactory();

      ManageBooks manageBook = new ManageBooks();
      manageBook.addAuthor();
      manageBook.addBook();
      manageBook.listBooks();
       
      factory.close();
   }
   
   public void addAuthor() {
       //  It holds a first-level cache (mandatory) of data
       Session session = factory.openSession();
       Transaction  tx = session.beginTransaction();

         Author author = new Author();
        // author.setId(100);
         author.setName("Shoumitro Roy");
         author.setAge(22);
         
        session.save(author);
        tx.commit();
         
        session.close();
   }

   public void addBook() {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

         Book bookEntry = new Book();
         bookEntry.setTitle("my title");
         bookEntry.setGenre("Gen");
         bookEntry.setAuthor("Balagurusamy");
         
         session.save(bookEntry);
         tx.commit();

         session.close();
   }

  public void listBooks( ) {
      
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

         List books = session.createQuery("FROM Book").list();

         for (Iterator iterator =books.iterator(); iterator.hasNext();) {
             
            Book book = (Book) iterator.next();
            
            System.out.println("\nTitle : " + book.getTitle());
            System.out.println("Genre of the  book: " + book.getGenre());

            System.out.println("Author name : " +  book.getAuthor());
            System.out.println("Id : " + book.getId());
            System.out.println(".......................");
          }
         session.close();
   }
}


