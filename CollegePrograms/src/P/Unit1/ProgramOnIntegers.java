package P.Unit1;
import java.util.Scanner;

public class ProgramOnIntegers {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        int age = 20;
        int marks = 95;

        System.out.println("===== INTEGER VARIABLES =====");
        System.out.println("Age   = " + age);
        System.out.println("Marks = " + marks);

        // 2. Arithmetic Operations
        int a = 25;
        int b = 10;

        System.out.println("\n===== ARITHMETIC OPERATIONS =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition       = " + (a + b));
        System.out.println("Subtraction    = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division       = " + (a / b));
        System.out.println("Remainder      = " + (a % b));

        // 3. Integer Range
        System.out.println("\n===== INTEGER RANGE =====");
        System.out.println("Minimum Value = " + Integer.MIN_VALUE);
        System.out.println("Maximum Value = " + Integer.MAX_VALUE);

        // 4. User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter an Integer: ");
        int num = sc.nextInt();

        System.out.println("You Entered = " + num);

        // 5. Overflow Demonstration
        int max = Integer.MAX_VALUE; //2147483647

        System.out.println("\n===== OVERFLOW DEMONSTRATION =====");
        System.out.println("Before Increment = " + max);

        max++;

        System.out.println("After Increment  = " + max);

        sc.close();
    }
}