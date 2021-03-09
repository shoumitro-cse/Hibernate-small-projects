/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "con_emp")
@AttributeOverrides({
    @AttributeOverride(name = "name",column =@Column(name = "name")),
    @AttributeOverride(name = "id",column = @Column(name = "id"))
})
public class Contract_Employee extends Employee{  
    @Column(name = "pay_per_hour")
    private float pay_per_hour;
    @Column(name = "contract_duration")
    private String contract_duration;  
  
//getters and setters  

    public float getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(float pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public String getContract_duration() {
        return contract_duration;
    }

    public void setContract_duration(String contract_duration) {
        this.contract_duration = contract_duration;
    }
}  