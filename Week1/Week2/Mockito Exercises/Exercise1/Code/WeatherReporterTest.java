package packag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {

    @Test
    public void testGenerateReport() {
        // Arrange
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getForecast("Bangalore")).thenReturn("Sunny with 30°C");

        WeatherReporter reporter = new WeatherReporter(mockService);

        // Act
        String report = reporter.generateReport("Bangalore");

        // Assert
        assertEquals("Weather in Bangalore: Sunny with 30°C", report);
    }
}