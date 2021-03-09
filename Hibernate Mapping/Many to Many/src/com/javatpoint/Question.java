package com.javatpoint;    
    
import java.util.List;  
import javax.persistence.*;    
    
@Entity  
@Table(name="question")  
public class Question {    

        @Id  
       // @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;    
    private String qname;   

    @ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL }) 
//    @JoinTable(name = "question_answer",   
//     joinColumns = { @JoinColumn(name = "qa_id",foreignKey = @ForeignKey(name = "fk_qa")) },   
//      inverseJoinColumns = { @JoinColumn(name = "ans_id",foreignKey = @ForeignKey(name = "fk_ans")) })
    
//    @JoinTable(name = "question_answer",joinColumns = {@JoinColumn(name = "qa_id",table = "question",foreignKey = @ForeignKey(name = "fk_qa"),
//               columnDefinition = "int",insertable = true,nullable = false,unique = false)},inverseJoinColumns = {@JoinColumn(name = "ans_id",
//               table = "answer",columnDefinition = "int",foreignKey = @ForeignKey(name = "fk_ans",foreignKeyDefinition = "int"),
//               referencedColumnName = "ans_id",unique = true,nullable = false)})
    
    @JoinTable(name = "question_answer",   
     joinColumns = { @JoinColumn(name = "qa_id") },   
      inverseJoinColumns = { @JoinColumn(name = "ans_id") },
      foreignKey = @ForeignKey(name = "fk_qa"),inverseForeignKey = @ForeignKey(name = "fk_ans")
    )
    private List<Answer> answers;  

    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getQname() {  
        return qname;  
    }  
    public void setQname(String qname) {  
        this.qname = qname;  
    }  
    public List<Answer> getAnswers() {  
        return answers;  
    }  
    public void setAnswers(List<Answer> answers) {  
        this.answers = answers;  
    }      
}  
