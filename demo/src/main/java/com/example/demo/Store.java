package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Store {

    static String name;

    @GetMapping("/store")
    public String storeName(){
        return "Hey ";
    }
}
