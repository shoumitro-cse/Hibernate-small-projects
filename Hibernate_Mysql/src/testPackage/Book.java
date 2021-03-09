package testPackage;
 
public class Book {
   private int id;
   private String title;
   private String genre;
   private String author;
 
   public Book() {}
   public Book(String title, String genre, String author ) {
      this.title = title;
      this.genre = genre;
      this.author = author;
   }
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public String getGenre() {
        return genre;
    }
 
    public void setGenre(String genre) {
        this.genre = genre;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
}