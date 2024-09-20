package com.service.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstname(String firstname);
}
