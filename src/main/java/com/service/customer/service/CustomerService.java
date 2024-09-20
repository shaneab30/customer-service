package com.service.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.customer.model.Customer;
import com.service.customer.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;


    // Get all customer
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    // Get customer by id
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    // Save/insert/update customer
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    // Delete customer by id
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

    // Get customer by firstname
    public List<Customer> findByFirstname(String firstname){
        return customerRepository.findByFirstname(firstname);
    }
}
