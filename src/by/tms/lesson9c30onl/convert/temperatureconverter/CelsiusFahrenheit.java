package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.BaseConverter;

public class CelsiusFahrenheit extends BaseConverter {
    @Override
    public double convert(double convertedValue) {
        return (convertedValue * 1.8) + 32;
    }
}
