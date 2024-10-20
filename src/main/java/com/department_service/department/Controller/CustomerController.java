package com.department_service.department.Controller;

import com.department_service.department.DTO.CustomerDTO;
import com.department_service.department.Service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
@Autowired
    private CustomerService customerService;

@PostMapping("/saveCustomer")
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDTO){

    CustomerDTO savedCustomer= customerService.saveCustomer(customerDTO);

    return new ResponseEntity<>(savedCustomer, HttpStatus.OK);

}



}
