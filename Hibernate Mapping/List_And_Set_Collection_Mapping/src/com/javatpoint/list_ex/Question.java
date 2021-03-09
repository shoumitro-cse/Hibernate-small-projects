
package com.javatpoint.list_ex;

import java.util.List;


public class Question {
    
    private  int id;
    private String  qname;
    private List<String> answar;

    public Question() {
        super();
    }

    public Question(String qname, List<String> answar) {
        super();
        this.qname = qname;
        this.answar = answar;
    }

    public Question(int id, String qname, List<String> answar) {
        this.id = id;
        this.qname = qname;
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

    public List<String> getAnswar() {
        return answar;
    }

    public void setAnswar(List<String> answar) {
        this.answar = answar;
    }
    
}
