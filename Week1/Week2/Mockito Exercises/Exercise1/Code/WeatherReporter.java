package packag;

public class WeatherReporter {
    private WeatherService weatherService;

    public WeatherReporter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String generateReport(String city) {
        String forecast = weatherService.getForecast(city);
        return "Weather in " + city + ": " + forecast;
    }
}
