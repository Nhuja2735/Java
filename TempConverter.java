import java.util.Scanner;

public class TempConverter {
    double temperature;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TempConverter converter = new TempConverter();

        System.out.print("Enter temperature value: ");
        if (scanner.hasNextDouble()) {
            converter.temperature = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.close();
            return;
        }

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                double fahrenheit = (converter.temperature * 9 / 5) + 32;
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", converter.temperature, fahrenheit);
                break;
            }
            case 2: {
                double celsius = (converter.temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", converter.temperature, celsius);
                break;
            }
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
