package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.interfaces.Convertible;

public class CelsiusKelvin implements Convertible {
    @Override
    public double convert(double convertedValue) {
        return convertedValue + 273.15;
    }
}
