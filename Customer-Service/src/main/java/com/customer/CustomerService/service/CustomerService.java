package com.customer.CustomerService.service;

import com.customer.CustomerService.controllers.CustomerController;
import com.customer.CustomerService.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer login(String email,String password);
    Customer register(Customer customer);
    void update(String email,Customer customer);
}
