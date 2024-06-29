import by.tms.lesson9c30onl.convert.BaseConverter;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusFahrenheit;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusKelvin;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusReaumur;
import by.tms.lesson9c30onl.convert.temperatureconverter.FahrenheitCelsius;

public class Main {
    public static void main(String[] args) {
        double temperatureCelsius = 25;
        BaseConverter celsiusFahrenheit = new CelsiusFahrenheit();
        System.out.println("Celsius to Fahrenheit: " + temperatureCelsius + " --> " + celsiusFahrenheit.convert(temperatureCelsius));

        double temperatureFahrenheit = 77;
        BaseConverter fahrenheitCelsius = new FahrenheitCelsius();
        System.out.println("Fahrenheit to Celsius: " + temperatureFahrenheit + " --> " + fahrenheitCelsius.convert(temperatureFahrenheit));

        temperatureCelsius = 12;
        BaseConverter celsiusReaumur = new CelsiusReaumur();
        System.out.println("Celsius to Reaumur: " + temperatureCelsius + " --> " + celsiusReaumur.convert(temperatureCelsius));

        temperatureCelsius = 0;
        BaseConverter celsiusKelvin = new CelsiusKelvin();
        System.out.println("Celsius to Kelvin: " + temperatureCelsius + " --> " + celsiusKelvin.convert(temperatureCelsius));
    }
}