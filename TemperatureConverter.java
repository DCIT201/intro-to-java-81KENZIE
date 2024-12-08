import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;

        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + " degrees Celsius is equal to " + convertedTemperature + " degrees Fahrenheit.");
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + " degrees Fahrenheit is equal to " + convertedTemperature + " degrees Celsius.");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}