package by.tms.lesson9c30onl.convert;

import by.tms.lesson9c30onl.convert.interfaces.Convertible;

public class BaseConverter {
    public double convert(double convertedValue, Convertible converting) {
        return converting.convert(convertedValue);
    }
}
