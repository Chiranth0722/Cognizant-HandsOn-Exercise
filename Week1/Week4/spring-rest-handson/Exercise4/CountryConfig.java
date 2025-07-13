package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CountryConfig {

    @Bean
    public List<Country> countryList() {
        List<Country> countries = new ArrayList<>();

        Country c1 = new Country();
        c1.setCode("IN");
        c1.setName("India");

        Country c2 = new Country();
        c2.setCode("US");
        c2.setName("United States");

        Country c3 = new Country();
        c3.setCode("CN");
        c3.setName("China");

        countries.add(c1);
        countries.add(c2);
        countries.add(c3);

        return countries;
    }
}
