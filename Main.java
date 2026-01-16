//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            static String appName = "Console Calculator";
    public static void main(String[] args) {

/**
 * CalculatorApp
 * Demonstrates variables, data types, input, casting, scope, and formatting
 */


            // Static variable (shared across class)

            // Instance variable (belongs to object)
            int instanceCounter = 1;



                // Local variables (exist only inside main)
                byte b = 10;          // 1 byte
                short s = 200;        // 2 bytes
                int i = 1000;         // 4 bytes
                long l = 100000L;     // 8 bytes
                float f = 10.5f;      // 4 bytes
                double d = 99.99;     // 8 bytes
                char c = 'A';         // 2 bytes
                boolean flag = true;  // 1 bit

                System.out.println("=== " + appName + " ===");

                Scanner sc = new Scanner(System.in);

                // Input from user
                System.out.print("Enter first number: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    return;
                }
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    return;
                }
                double num2 = sc.nextDouble();

                // Arithmetic operations
                double sum = num1 + num2;
                double diff = num1 - num2;
                double product = num1 * num2;
                double quotient = (num2 != 0) ? num1 / num2 : 0;

                // Type casting
                int castedSum = (int) sum; // Explicit casting

                // Formatted output
                System.out.printf("Sum: %.2f%n", sum);
                System.out.printf("Difference: %.2f%n", diff);
                System.out.printf("Product: %.2f%n", product);

                if (num2 != 0) {
                    System.out.printf("Quotient: %.2f%n", quotient);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }

                System.out.println("Sum after casting to int: " + castedSum);

                sc.close();
            }
        }


