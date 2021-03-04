package com.spring.boot.developer.tools.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping(value = "/api/v1/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> findCustomerNames(){
        Map<String, String> customers = new HashMap<>();;
        customers.put("1", "jack");
        customers.put("2", "jill");

        return customers;
    }
}