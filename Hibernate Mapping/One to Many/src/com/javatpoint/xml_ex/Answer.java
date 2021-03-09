package com.javatpoint.xml_ex;


public class Answer {
    
   private int id;  
   private String answername;  
   private String postedBy;  

    public Answer(String answername, String postedBy) {
        this.answername = answername;
        this.postedBy = postedBy;
    }

    public Answer() {
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswername() {
        return answername;
    }

    public void setAnswername(String answername) {
        this.answername = answername;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
   
   
}
