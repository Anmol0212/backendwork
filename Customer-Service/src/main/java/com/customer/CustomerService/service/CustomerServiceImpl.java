package com.customer.CustomerService.service;

import com.customer.CustomerService.entity.Customer;
import com.customer.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer login(String email, String password) {
     Customer customer=customerRepository.findbyemail(email);
     if(customer!=null) {
         if (customer.getPassword().equals(password)) {
             return customer;
         }
         else {
             throw new IllegalArgumentException("Incorrect Password");
         }
     }
     else {
         throw new IllegalArgumentException("Invalid EmailId");
     }
    }

    @Override
    public Customer register(Customer customer) {
        Customer customer1=customerRepository.findbyemail(customer.getEmail());
        if(customer1!=null)
            throw new IllegalArgumentException("Email id already exists");
        else {
            return customerRepository.save(customer);
        }
    }

    @Override
    public void update(String email,Customer customer) {
        Customer customer1=customerRepository.findbyemail(email).orElse


    }
}
