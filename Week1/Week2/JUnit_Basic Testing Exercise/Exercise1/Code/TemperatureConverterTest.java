package com.example.setup_junit_eclipse_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        double result = converter.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001, "0°C should be 32°F");

        result = converter.celsiusToFahrenheit(100);
        assertEquals(212.0, result, 0.001, "100°C should be 212°F");
    }
}