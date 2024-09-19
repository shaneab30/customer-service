package com.service.customer.repository;

import java.util.List;
// import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.service.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstname(String firstname);

    // Optional<Customer> findByEmail(String email);

    // // Custom query
    // @Query("SELECT c FROM Customer c WHERE c.birthday = :birthday")
    // List<Customer> findByBirthday(LocalDate birthday);

    // Update query
    // @Modifying
    // @Query("UPDATE Customer c SET c.firstname = :firstname, c.lastname = :lastname, c.address = :address, c.telephone = :telephone, c.birthday = :birthday, c.email = :email WHERE c.id = :id")
    // void updateEmailById(@Param("id") Long id, @Param("firstname") String firstname, @Param("lastname") String lastname, @Param("address") String address,@Param("telephone") String telephone, @Param("birthday") LocalDate birthday, @Param("email") String email);
}
