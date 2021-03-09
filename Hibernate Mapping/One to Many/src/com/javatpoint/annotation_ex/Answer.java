package com.javatpoint.annotation_ex;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer implements Serializable {
    
    @Id
   // @GeneratedValue(strategy = GenerationType.TABLE)
   private int id;  
    
    @Column(name ="answername" )
   private String answername;  
    
    @Column(name = "postedBy")
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
