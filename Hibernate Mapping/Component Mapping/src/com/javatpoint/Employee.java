package com.javatpoint;  

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@NamedQueries( {
   @NamedQuery(name = "find_emp",query = "from Employee"),
   @NamedQuery(name = "find_name",query = "from Employee e where e.name = :name ")
})
@Entity
@Table(name = "emp")
public class Employee implements Serializable {  
    
    @Id
    @GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
    private int id;  
    private String name;  
    private Address address; //HAS-A Relation  

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
}  
