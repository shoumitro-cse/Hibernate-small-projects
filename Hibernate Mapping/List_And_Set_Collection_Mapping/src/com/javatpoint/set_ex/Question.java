
package com.javatpoint.set_ex;
import java.util.Set;


public class Question {
    
    private  int id;
    private String  qname;
    private Set<String> answar;

    public Question() {
        super();
    }

    public Question(  String qname, Set<String> answar) {
        super();
        this.qname = qname;
        this.answar = answar;
    }


    public Set<String> getAnswar() {
        return answar;
    }

    public void setAnswar(Set<String> answar) {
        this.answar = answar;
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

    
}
