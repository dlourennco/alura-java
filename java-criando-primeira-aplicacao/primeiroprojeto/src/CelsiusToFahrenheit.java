public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        // converter celsius para fahrenheit (temperatura * 1.8) + 32
        int temperaturaCelsius = 35;

        int fahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);
        System.out.println(String.format("%d graus Celsius convertido para Fahrenheit é: %d graus Fahrenheit", temperaturaCelsius, fahrenheit));
    }
}
