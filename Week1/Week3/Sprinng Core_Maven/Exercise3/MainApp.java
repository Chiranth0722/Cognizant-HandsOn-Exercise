package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrainingCenter center = context.getBean("trainingCenter", TrainingCenter.class);
        center.displayCourseInfo();
    }
}
