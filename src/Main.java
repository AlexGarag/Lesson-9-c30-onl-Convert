import by.tms.lesson9c30onl.convert.BaseConverter;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusFahrenheit;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusKelvin;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusReaumur;

public class Main {
    public static void main(String[] args) {
        double temperatureCelsius = 25;
        BaseConverter converter = new BaseConverter();

        CelsiusKelvin celsiusKelvin = new CelsiusKelvin();
        System.out.println();
        System.out.println("Celsius to Fahrenheit: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, celsiusKelvin));

        CelsiusReaumur celsiusReaumur = new CelsiusReaumur();
        System.out.println();
        System.out.println("Celsius to Reaumur: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, celsiusReaumur));

        CelsiusFahrenheit celsiusFahrenheit = new CelsiusFahrenheit();
        System.out.println();
        System.out.println("Celsius to Fahrenheit: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, celsiusFahrenheit));
    }
}