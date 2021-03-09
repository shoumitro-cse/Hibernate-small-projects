package com.javatpoint.mypackage;
// Generated Apr 10, 2019 11:01:53 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// can not create employee.hnm.xml file
@Entity
@Table(name = "Employee", catalog = "std")
public class Employee implements java.io.Serializable {

    @Id
    private int id;
    
    @Column(name = "firstName", table = "Employee")
    private String firstName;
    
    @Column(name = "lastName", table = "Employee")
    private String lastName;

    @Column(name = "age",
            table = "Employee",
            columnDefinition = "int",
            length = 4,
            insertable = true,
            nullable = false,
            precision = 0,
            scale = 0,
            unique = false,
            updatable = true)
    private int age;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
