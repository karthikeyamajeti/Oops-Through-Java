package UNIT0;
/*
WAP to demonstrate exception handling for ArithmeticException,
ArrayIndexOutOfBoundsException, and NullPointerException using
separate try-catch blocks.
*/
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Division operation
        try {
            System.out.print("Enter the numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }

        // Array access operation
        int arr[] = {1, 2, 3, 4, 5};

        try {
            System.out.print("Enter the index to access in the array: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds.");
        }

        // String length operation
        try {
            System.out.print("Enter a string (or 'null' to simulate null pointer exception): ");
            String str = sc.next();

            // Converting the literal "null" into a null reference
            if (str.equals("null")) {
                str = null;
            }

            System.out.println("Length of the string: " + str.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot perform operations on a null reference.");
        }
    }
}