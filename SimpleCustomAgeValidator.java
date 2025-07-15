import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class SimpleCustomAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        try {
            int age = validateAge(input);
            System.out.println("Your age is: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Validation Method
    public static int validateAge(String input) throws InvalidAgeException {
        try {
            int age = Integer.parseInt(input);
            if (age <= 0) {
                throw new InvalidAgeException("Age must be greater than 0.");
            }
            return age;
        } catch (NumberFormatException e) {
            throw new InvalidAgeException("Age must be a numeric value.");
        }
    }
}
