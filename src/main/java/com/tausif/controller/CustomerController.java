package com.tausif.controller;


import com.tausif.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cutomer")
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    @RequestMapping(value = {"/", "/home", "/index"})
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Welcome to Customer Backend Api");
    }
}
