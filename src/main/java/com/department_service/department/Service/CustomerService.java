package com.department_service.department.Service;

import com.department_service.department.DTO.CustomerDTO;
import com.department_service.department.Entity.Customer;
import com.department_service.department.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO saveCustomer(CustomerDTO customerDTO){
        Customer newCustomer = new Customer(customerDTO.getAge(),customerDTO.getCustomerId(),customerDTO.getCustomerName(),customerDTO.getCustomerAddress(),customerDTO.isEligibleForFreeDelivery()
        );
        Customer saveCustomer= customerRepository.save(newCustomer);

        CustomerDTO savedCustomer= new CustomerDTO(saveCustomer.getAge(),saveCustomer.getCustomerId(),saveCustomer.getCustomerName()
        ,saveCustomer.getCustomerAddress(),saveCustomer.isEligibleForFreeDelivery());

        return savedCustomer;
    }


}
