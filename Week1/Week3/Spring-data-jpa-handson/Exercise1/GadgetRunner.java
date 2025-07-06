package com.example;

import com.example.entity.Gadget;
import com.example.repository.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GadgetRunner implements CommandLineRunner {

    @Autowired
    private GadgetRepository gadgetRepository;

    @Override
    public void run(String... args) {
        // Create and save some gadgets
        gadgetRepository.save(new Gadget(1, "Apple", "iPhone 15"));
        gadgetRepository.save(new Gadget(2, "Samsung", "Galaxy S24"));

        // Fetch and display all gadgets
        System.out.println("All Gadgets:");
        gadgetRepository.findAll().forEach(g -> 
            System.out.println(g.getId() + ": " + g.getBrand() + " - " + g.getModel()));
    }
}
