package com.javatpoint;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {  
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
    private int employeeId;  
    private String name,email;  
    
    // add a column addr_join in table emp and add foreign key fk_emp
    @OneToOne(targetEntity = Address.class,cascade = {CascadeType.ALL})
    @JoinColumn(name = "addr_join",foreignKey = @ForeignKey(name = "fk_emp") )
    private Address address;  

    public Employee(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    Employee() {
        super();
    }
    

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}  