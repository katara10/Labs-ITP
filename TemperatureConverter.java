import java.util.Scanner;

public class TemperatureConverter {
    public static double ToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("t C: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ToFahrenheit(celsius);
        System.out.printf("t F: %.2f%n", fahrenheit);
        scanner.close();
    }
}