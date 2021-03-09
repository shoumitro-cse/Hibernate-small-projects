package com.javatpoint;  
  
import java.util.List;
import javax.persistence.*;  
  
@Entity  
@Table(name="answer")  
public class Answer {   

        @Id  
     //   @GeneratedValue(strategy=GenerationType.AUTO)  
    private int ans_id;    

    private String answername;    
    private String postedBy;  


     @ManyToMany(targetEntity = Question.class,cascade = CascadeType.ALL)
     
     @JoinTable(name = "answer_question",   
     joinColumns = { @JoinColumn(name = "ans_qa_id") },   
      inverseJoinColumns = { @JoinColumn(name = "id") },
      foreignKey = @ForeignKey(name = "fk_ans_qa"),inverseForeignKey = @ForeignKey(name = "fk_qa_ans")
    )
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
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
