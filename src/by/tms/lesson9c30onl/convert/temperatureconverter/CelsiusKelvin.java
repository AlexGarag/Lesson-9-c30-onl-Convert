package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.BaseConverter;

public class CelsiusKelvin extends BaseConverter {
    @Override
    public double convert(double convertedValue) {
        return convertedValue + 273.15;
    }
}
