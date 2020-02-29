package fundamentals.basics.temperatureconvertertesting;

import org.junit.Assert;
import org.junit.Test;
import sdacademy.fundamentalstesting.temperatureconverter.TemperatureConverter;

public class TemperatureConverterTesting {

    @Test

    public void testConversionToFahrenheit() {

        // given
        TemperatureConverter temperatureConverter = new TemperatureConverter();


        // when
       int result1 = temperatureConverter.toFahrenheit(20);
       int result2 = temperatureConverter.toFahrenheit(30);

        // then
        Assert.assertEquals(68, result1);
        Assert.assertEquals(86, result2);
    }

    @Test
    public void testConversionToCelsius() {
        // given
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // when
        int result1 = temperatureConverter.toCelsius(104);
        int result2 = temperatureConverter.toCelsius(122);

        // then

        Assert.assertEquals(40, result1);
        Assert.assertEquals(50, result2);
    }
}
