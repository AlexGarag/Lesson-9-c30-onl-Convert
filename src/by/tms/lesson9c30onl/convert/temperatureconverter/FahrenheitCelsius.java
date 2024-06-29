package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.BaseConverter;

public class FahrenheitCelsius extends BaseConverter {
    @Override
    public double convert(double convertedValue) {
        return (convertedValue - 32) * 5 / 9;
    }
}
