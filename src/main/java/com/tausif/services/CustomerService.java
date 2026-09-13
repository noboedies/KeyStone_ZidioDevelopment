package com.tausif.services;


import com.tausif.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

//    public CustomerService(CustomerRepo customerRepo){
//        this.customerRepo = customerRepo;
//    }


}
