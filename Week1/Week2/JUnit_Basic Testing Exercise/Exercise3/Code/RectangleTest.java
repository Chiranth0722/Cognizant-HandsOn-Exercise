package com.example.setup_junit_eclipse_02;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    Rectangle rect;

    @BeforeEach
    public void setUp() {
        // Arrange
        rect = new Rectangle(5.0, 3.0);
    }

    @AfterEach
    public void tearDown() {
        rect = null;
    }

    @Test
    public void testCalculateArea() {
        // Act
        double area = rect.calculateArea();

        // Assert
        assertEquals(15.0, area, "Area should be length × width");
    }

    @Test
    public void testCalculatePerimeter() {
        double perimeter = rect.calculatePerimeter();
        assertEquals(16.0, perimeter, "Perimeter should be 2*(length + width)");
    }

    @Test
    public void testResize() {
        rect.resize(2.0); // length becomes 10, width becomes 6
        double expectedArea = 10.0 * 6.0; // 60.0
        assertEquals(expectedArea, rect.calculateArea(), 0.001, "Area should be updated correctly after resize");
    }
}
