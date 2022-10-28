public class Task14 {
    public static double CelciusToKelvin(double celcius) {
        double temperature = celcius + 273.15;
        return temperature;
    }

    public static double CelciusToFahrenheit(double celcius) {
        double temperature = (celcius * 1.8)+32;
        return temperature;
    }

    public static double KelvinToCelcius(double kelvin) {
        double temperature = kelvin - 273.15;
        return temperature;
    }
    public static double KelvinToFahrenheit(double kelvin) {
        double temperature = 1.8*(kelvin-273) + 32;
        return temperature;
    }

    public static double FahrenheitToCelcius(double fahrenheit) {
        double temperature = 5/9 * (fahrenheit-32);
        return temperature;
    }

    public static double FahrenheitToKelvin(double fahrenheit) {
        double temperature = ((fahrenheit-32)/1.8) + 273.15;
        return temperature;
    }

    public static void main(String[] args) {
        System.out.println(CelciusToKelvin(25.0));
        System.out.println(CelciusToFahrenheit(25.0));
        System.out.println(FahrenheitToCelcius(100.0));
        System.out.println(FahrenheitToKelvin(100.0));
        System.out.println(KelvinToCelcius(0));
        System.out.println(KelvinToFahrenheit(0));
    }
}
