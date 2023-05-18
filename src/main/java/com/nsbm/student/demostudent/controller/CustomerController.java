package com.nsbm.student.demostudent.controller;

import com.nsbm.student.demostudent.dto.CustomerDto;
import com.nsbm.student.demostudent.entity.Customer;
import com.nsbm.student.demostudent.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customer_info")
    List<CustomerDto> getCustomer(){

        List<Customer> customerList = customerRepository.findAll();

        List<CustomerDto> customerDtoList = dataMap(customerList);

        return customerDtoList;
//        Customer a = new Customer();
//        a.setId(1);
//        a.setName("Shawn");
//        a.setAddress("Antarctica");
//        a.setTel_no("74929847274");
//
//        Customer b = new Customer();
//        b.setId(2);
//        b.setName("Pooh");
//        b.setAddress("Brooklyn");
//        b.setTel_no("4782874");

    }

    private List<CustomerDto> dataMap(List<Customer> customerList) {
        List<CustomerDto> customerDtoList = new ArrayList<>();

        for (Customer customer : customerList) {

            CustomerDto c = new CustomerDto();
            c.setName(customer.getName());
            c.setAddress(customer.getAddress());

            customerDtoList.add(c);
        }

        return customerDtoList;
    }
}
