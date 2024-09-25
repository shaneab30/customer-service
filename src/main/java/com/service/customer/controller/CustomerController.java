package com.service.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.customer.dto.CustomerResponse;
import com.service.customer.model.Customer;
import com.service.customer.service.CustomerService;

import java.util.*;
// import java.time.LocalDate;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Get all customer
    @GetMapping
    public List<CustomerResponse> findAll() {
        return customerService.findAll();
    }

    // Get customer by id
    @GetMapping("/{id}")
    public Optional<CustomerResponse> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    // Save/insert customer
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    // Update customer
    @PutMapping
    public Customer update(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    // Delete customer by id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }

    // Get all customer by firstname
    @GetMapping("/find/firstname/{firstname}")
    public List<CustomerResponse> findByFirstname(@PathVariable String firstname) {
        return customerService.findByFirstname(firstname);
    }
}
