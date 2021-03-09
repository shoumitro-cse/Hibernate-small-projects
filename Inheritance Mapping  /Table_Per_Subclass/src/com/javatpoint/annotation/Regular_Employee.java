/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.annotation;

import javax.persistence.*;  
  
@Entity  
@Table(name="regularemployee103")  
@PrimaryKeyJoinColumn(name="ID_foregin",referencedColumnName = "id")  
public class Regular_Employee extends Employee{  
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private int bonus;  

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}  