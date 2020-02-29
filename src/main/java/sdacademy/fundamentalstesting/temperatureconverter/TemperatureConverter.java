package sdacademy.fundamentalstesting.temperatureconverter;

public class TemperatureConverter {

    public int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public int toFahrenheit (int celcius) {
        return celcius * 9 / 5 + 32;
    }
}
