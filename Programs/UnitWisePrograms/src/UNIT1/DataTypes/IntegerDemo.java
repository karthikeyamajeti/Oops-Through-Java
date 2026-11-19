package UNIT1.DataTypes;
//WAP in Java to demonstrate integer variables, arithmetic operations, integer range, user input and overflow.

import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        //Declaring and initializing integer variables
        int age = 20;
        int marks = 95;

        //Displaying integer variables
        System.out.println("===== INTEGER VARIABLES =====");
        System.out.println("Age   = " + age);
        System.out.println("Marks = " + marks);

        //Declaring and initializing variables for arithmetic operations
        int a = 25;
        int b = 10;

        //Performing arithmetic operations
        System.out.println("\n===== ARITHMETIC OPERATIONS =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition       = " + (a + b));
        System.out.println("Subtraction    = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division       = " + (a / b));
        System.out.println("Remainder      = " + (a % b));

        //Displaying the minimum and maximum integer values
        System.out.println("\n===== INTEGER RANGE =====");
        System.out.println("Minimum Value = " + Integer.MIN_VALUE);
        System.out.println("Maximum Value = " + Integer.MAX_VALUE);

        //Creating a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        //Accepting an integer from the user
        System.out.print("\nEnter an Integer: ");
        int num = sc.nextInt();

        //Displaying the entered integer
        System.out.println("You Entered = " + num);

        //Demonstrating integer overflow
        int max = Integer.MAX_VALUE;

        System.out.println("\n===== OVERFLOW DEMONSTRATION =====");
        System.out.println("Before Increment = " + max);

        //Incrementing the maximum integer value
        max++;

        System.out.println("After Increment  = " + max);

        //Closing the Scanner object
        sc.close();
    }
}