package com.department_service.department.Entity;

import com.department_service.department.Converter.BooleanToStringConverter;
import jakarta.persistence.*;


@Entity
public class Customer {
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;



    private String customerName;
    private String customerAddress;

    public boolean isEligibleForFreeDelivery() {
        return isEligibleForFreeDelivery;
    }

    public void setEligibleForFreeDelivery(boolean eligibleForFreeDelivery) {
        isEligibleForFreeDelivery = eligibleForFreeDelivery;
    }
    @Convert(converter= BooleanToStringConverter.class)
    private boolean isEligibleForFreeDelivery;
    public Customer() {
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Customer(int age, int customerId, String customerName, String customerAddress,boolean isEligibleForFreeDelivery) {
        this.age = age;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.isEligibleForFreeDelivery=isEligibleForFreeDelivery;
    }



}
