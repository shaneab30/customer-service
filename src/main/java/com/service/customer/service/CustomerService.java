package com.service.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.customer.dto.CustomerResponse;
import com.service.customer.model.Customer;
import com.service.customer.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;


    // Get all customer
    public List<CustomerResponse> findAll(){
        List<Customer> customers = customerRepository.findAll();
        return customers.stream().map(this::convertToCustomerResponse).toList();
        // use .collect(Collectors.toList()) for mutable list
    }

    // Get customer by id
    public Optional<CustomerResponse> findById(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(this::convertToCustomerResponse);
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
    public List<CustomerResponse> findByFirstname(String firstname){
        List<Customer> customers = customerRepository.findByFirstname(firstname);
        return customers.stream().map(this::convertToCustomerResponse).toList();
        // use .collect(Collectors.toList()) for mutable list
    }


    private CustomerResponse convertToCustomerResponse(Customer customer) {
        return new CustomerResponse(customer.getId(), customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getAddress(), customer.getTelephone(), customer.getBirthday());
    }
}
