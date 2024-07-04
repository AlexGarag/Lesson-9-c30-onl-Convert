package by.tms.lesson9c30onl.convert.temperatureconverter;

import by.tms.lesson9c30onl.convert.interfaces.Convertible;

public class CelsiusReaumur implements Convertible {
    @Override
    public double convert(double convertedValue) {
        return convertedValue / 10 * 8;
    }
}
