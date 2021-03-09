package com.javatpoint.annotation_ex;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "employee101")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee {

    @Id
//@GeneratedValue(strategy=GenerationType.AUTO)      
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//setters and getters  
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
}
