package com.example.setup_junit_eclipse_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testPassStatus() {
        Student s1 = new Student("Alice", 45);
        assertTrue(s1.hasPassed(), "Alice should pass");

        Student s2 = new Student("Bob", 30);
        assertFalse(s2.hasPassed(), "Bob should fail");
    }

    @Test
    public void testGrades() {
        Student s1 = new Student("Eva", 90);
        assertEquals("A", s1.getGrade());

        Student s2 = new Student("Dan", 55);
        assertEquals("C", s2.getGrade());

        Student s3 = new Student("Tom", 39);
        assertEquals("D", s3.getGrade());
        assertNotEquals("A", s3.getGrade());
    }

    @Test
    public void testNameNotNull() {
        Student s = new Student("Leo", 60);
        assertNotNull(s.getName(), "Student name should not be null");
    }
}

