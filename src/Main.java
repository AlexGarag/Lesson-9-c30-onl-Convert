import by.tms.lesson9c30onl.convert.BaseConverter;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusFahrenheit;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusKelvin;
import by.tms.lesson9c30onl.convert.temperatureconverter.CelsiusReaumur;

public class Main {
    public static void main(String[] args) {
        double temperatureCelsius = 25;
        BaseConverter converter = new BaseConverter();

        System.out.println();
        System.out.println("Celsius to Fahrenheit: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, new CelsiusKelvin()));
// мог бы "Celsius to Fahrenheit: " + temperatureCelsius + " --> " " запихнуть параметром в метод BaseConverter.convert, но
// не захотел усложнять код
        System.out.println("Celsius to Reaumur: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, new CelsiusReaumur()));
        System.out.println("Celsius to Fahrenheit: " + temperatureCelsius + " --> " + converter.convert(temperatureCelsius, new CelsiusFahrenheit()));
    }
}