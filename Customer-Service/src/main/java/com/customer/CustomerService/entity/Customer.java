package com.customer.CustomerService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer_Service")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;
    private String address;
    private String phoneNo;
    private String email;
    private String password;
}
