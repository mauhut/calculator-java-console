import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===== Basic Calculator =====");

        while(running){
//            System.out.println("\nSelect an operation: ");
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("\nSelect an operation: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Exiting the calculator. ¡Bye!");
                break;
            }

            System.out.print("Enter first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double number2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = number1 + number2;
                    checkResultType(result);
                    break;

                case 2:
                    result = number1 - number2;
                    checkResultType(result);
                    break;

                case 3:
                    result = number1 * number2;
                    checkResultType(result);
                    break;

                case 4:
                    if (number2 != 0) {
                        result = number1 / number2;
                        checkResultType(result);
                        break;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");

            }

        }
        scanner.close();
    }

    public static void checkResultType(double result) {
        if (result % 1 == 0) {
            System.out.println("Result is: " + (int)result);
        } else {
            System.out.println("Result is: " + result);
        }
    }
}