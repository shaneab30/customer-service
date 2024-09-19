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
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    // Get customer by id
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
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

    // // Update customer by id
    // @ResponseStatus(HttpStatus.OK) // 200
    // @PutMapping("/{id}")
    // public Customer updateById(@PathVariable Long id, @RequestBody Customer customer) {
    //     return customerService.update(id, customer);
    // }

    // Delete customer by id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }

    // Get customer by email
    // @GetMapping("/find/email/{email}")
    // public Optional<Customer> findByEmail(@PathVariable String email) {
    //     return customerService.findByEmail(email);
    // }

    // Get all customer by firstname
    @GetMapping("/find/firstname/{firstname}")
    public List<Customer> findByFirstname(@PathVariable String firstname) {
        return customerService.findByFirstname(firstname);
    }

    // Get all customer by birthday
    // @GetMapping("/find/birthday/{birthday}")
    // public List<Customer> findByBirthday(@PathVariable LocalDate birthday) {
    //     return customerService.findByBirthday(birthday);
    // }
}
