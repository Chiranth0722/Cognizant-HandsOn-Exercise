package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        // Hardcoded response for testing
        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India");
        } else if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States");
        } else {
            return new Country(code.toUpperCase(), "Unknown");
        }
    }
}
