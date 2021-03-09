
package com.javatpoint;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
class Address implements Serializable {
    
    @Id
    @GeneratedValue(generator = "increment",strategy = GenerationType.AUTO)
    private int addressId;  
    private String addressLine1,city,state,country;  
    private int pincode;  
    
    @OneToOne(targetEntity = Employee.class,cascade = {CascadeType.ALL})
    @JoinColumn(name = "emp_join",foreignKey = @ForeignKey(name = "fk_addr"))
    private Employee employee;  
    //setters and getters  

    public Address(String addressLine1, String city, String state, String country, int pincode, Employee employee) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.employee = employee;
    }

    Address() {
        super();
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
