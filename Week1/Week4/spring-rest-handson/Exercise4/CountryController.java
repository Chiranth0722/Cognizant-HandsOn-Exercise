package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private List<Country> countryList;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryList;
    }
}
