package org.example;

import java.util.Scanner;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        while (true) {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Check if Celsius temperature is extreme");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + converter.celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + converter.fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    double temp = scanner.nextDouble();
                    if (converter.isExtremeTemperature(temp)) {
                        System.out.println("This is an extreme temperature!");
                    } else {
                        System.out.println("This temperature is normal.");
                    }
                    break;
                case 4:
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvin = scanner.nextDouble();
                    System.out.println("Temperature in Celsius: " + kelvinToCelsius(kelvin));
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-5.");
            }
        }
    }
}
