package com.service.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String telephone;
    private LocalDate birthday;
}
