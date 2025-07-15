//create a console-based calculator app that takes user inputs,performs calcuations,and display 
import java.util.Scanner;//Scanner imported to take user input
public class BasicCalculator {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);//User Input
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();//Number intake
        int number2 = input.nextInt();//number intake
        System.out.println("Enter 1.Addition\n 2.Subtraction\n 3.Division\n 4.Multiplication\n");
        int n = input.nextInt();
        switch (n) {
            case 1 : {
                int result = number1 + number2;
                System.out.println("Addition: " + result);
                break;
            }
              case 2 :{
                int result = number1 - number2;
                System.out.println("Subtraction " + result);
                break;
            }
              case 3 :{
                int result = number1 / number2;
                System.out.println("Division " + result);
                break;
            }
              case 4 : {
                int result = number1 * number2;
                System.out.println("Multiplication " + result);
                break;
            }
            default:
            System.out.println("Invalid Input");
            break;
        }

        input.close();
    }
}
