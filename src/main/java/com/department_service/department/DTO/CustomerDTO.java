package com.department_service.department.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class CustomerDTO {
    private int age;

    private int customerId;



    private String customerName;
    private String customerAddress;

    public boolean isEligibleForFreeDelivery() {
        return isEligibleForFreeDelivery;
    }

    public void setEligibleForFreeDelivery(boolean eligibleForFreeDelivery) {
        isEligibleForFreeDelivery = eligibleForFreeDelivery;
    }

    private boolean isEligibleForFreeDelivery;

    public CustomerDTO(int age, int customerId, String customerName, String customerAddress,boolean isEligibleForFreeDelivery) {
        this.age = age;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.isEligibleForFreeDelivery=isEligibleForFreeDelivery;

    }

    public CustomerDTO() {
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
}
