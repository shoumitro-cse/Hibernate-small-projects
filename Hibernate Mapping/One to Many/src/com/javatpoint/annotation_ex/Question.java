
package com.javatpoint.annotation_ex;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question implements Serializable {
    
    @Id
   // @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id;  
    
    @Column(name = "qname")
    private String qname;  
    
   // @OneToMany(cascade = CascadeType.ALL )
    @OneToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })  
    @JoinColumn(name = "qid")
    @OrderColumn(name = "type")
    private List<Answer> answers;  

    public Question() {
        super();
    }

    public Question(String qname, List<Answer> answers) {
        super();
        this.qname = qname;
        this.answers = answers;
    }

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
