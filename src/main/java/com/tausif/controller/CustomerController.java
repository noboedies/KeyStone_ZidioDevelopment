package com.tausif.controller;


import com.tausif.dto.CustomerRegDto;
import com.tausif.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody CustomerRegDto customerRegDto){
        return ResponseEntity.ok(customerService.register(customerRegDto));
    }
}
