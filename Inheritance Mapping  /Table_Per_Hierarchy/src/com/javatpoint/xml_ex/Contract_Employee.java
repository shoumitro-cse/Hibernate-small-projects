package com.javatpoint.xml_ex;

public class Contract_Employee extends Employee{
    
    private float pay_per_hours;
    private  String contract_duration;

    public float getPay_per_hours() {
        return pay_per_hours;
    }

    public void setPay_per_hours(float pay_per_hours) {
        this.pay_per_hours = pay_per_hours;
    }

    public String getContract_duration() {
        return contract_duration;
    }

    public void setContract_duration(String contract_duration) {
        this.contract_duration = contract_duration;
    }
    
    
}
