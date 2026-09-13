package com.tausif.services;


import com.tausif.dto.CustomerRegDto;
import com.tausif.entity.Customer;
import com.tausif.repository.CustomerRepo;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean register(CustomerRegDto customerRegDto) {
        Customer customer = customerRepo.findByEmail(customerRegDto.getEmail());
        if(customer == null){
            customer = customerRepo.findByUsername(customerRegDto.getUsername());
        }

        if(customer == null){
            customer = mapToEntity(customerRegDto);
            customerRepo.save(customer);
            return true;
        }
        return false;
    }

    private Customer mapToEntity(CustomerRegDto customerRegDto) {
        Customer customer = new Customer();
        customer.setEmail(customerRegDto.getEmail());
        customer.setUsername(customerRegDto.getUsername());
        customer.setName(customerRegDto.getName());
        customer.setPassword(customerRegDto.getPassword());
        customer.setPhone(customerRegDto.getPhone());
        customer.setCreatedAt(LocalDateTime.now());
        return customer;
    }

//    public CustomerService(CustomerRepo customerRepo){
//        this.customerRepo = customerRepo;
//    }


}
