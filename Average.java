
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        float average = (float) sum / numbers.length;
        System.out.println("The average is: " + average);

        input.close();  
    }
}
