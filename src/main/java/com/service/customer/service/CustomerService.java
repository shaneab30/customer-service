package com.service.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.customer.model.Customer;
import com.service.customer.repository.CustomerRepository;

// import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
// import java.time.LocalDate;
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

    // Update customer (optional)
    // @Transactional
    // public Customer update(Long id, Customer customer){
    //     customerRepository.updateEmailById(
    //     id, 
    //     customer.getFirstname(), 
    //     customer.getLastname(), 
    //     customer.getAddress(), 
    //     customer.getTelephone(), 
    //     customer.getBirthday(), 
    //     customer.getEmail());
    //     return customer;
    // }

    // Delete customer by id
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

    // Get all customer by email
    // public Optional<Customer> findByEmail(String email){
    //     return customerRepository.findByEmail(email);
    // }

    // Get customer by firstname
    public List<Customer> findByFirstname(String firstname){
        return customerRepository.findByFirstname(firstname);
    }

    // Get a list of customer by birthday
    // public List<Customer> findByBirthday(LocalDate birthday){
    //     return customerRepository.findByBirthday(birthday);
    // }
}
