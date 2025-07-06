package com.training;

public class TrainingCenter {
    private Course course;

    public TrainingCenter(Course course) {
        this.course = course;
    }

    public void displayCourseInfo() {
        System.out.println("Training Center offers:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Duration: " + course.getDuration());
    }
}
