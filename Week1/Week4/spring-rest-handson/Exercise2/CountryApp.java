package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Country country = (Country) context.getBean("country");
        System.out.println("Country Name: " + country.getName());
        System.out.println("Capital: " + country.getCapital());
    }
}

