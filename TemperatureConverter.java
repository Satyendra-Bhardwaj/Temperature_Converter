

// Temperature Converter: A Java console application that converts temperature between Celsius, Fahrenheit, and Kelvin.
// Technologies Used :  Java,Scanner,Exception Handling

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Choose Input Unit (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        double c, f, k;

        switch (choice) {

            case 1:
                f = (temp * 9 / 5) + 32;
                k = temp + 273.15;

                System.out.println("\nTemperature in Fahrenheit = " + f);
                System.out.println("Temperature in Kelvin = " + k);
                break;

            case 2:
                c = (temp - 32) * 5 / 9;
                k = c + 273.15;

                System.out.println("\nTemperature in Celsius = " + c);
                System.out.println("Temperature in Kelvin = " + k);
                break;

            case 3:
                c = temp - 273.15;
                f = (c * 9 / 5) + 32;

                System.out.println("\nTemperature in Celsius = " + c);
                System.out.println("Temperature in Fahrenheit = " + f);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}