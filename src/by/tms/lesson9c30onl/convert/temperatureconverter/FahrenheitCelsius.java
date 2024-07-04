package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.interfaces.Convertible;

public class FahrenheitCelsius implements Convertible {
    @Override
    public double convert(double convertedValue) {
        return (convertedValue - 32) * 5 / 9;
    }
}
