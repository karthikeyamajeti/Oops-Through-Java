package UNIT0;
/*
WAP to demonstrate constructor overloading using default,
one-parameter, and two-parameter constructors.
*/
import java.util.*;
class Test {
    // Declaring private instance variables
    private int i, j;

    // Default constructor initializes both variables to 0
    Test() {
        i = 0;
        j = 0;
    }

    // Parameterized constructor initializes i and j to 0
    Test(int i) {
        this.i = i;
        this.j = 0;
    }

    // Parameterized constructor initializes both variables
    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Method to display the values of i and j
    void display() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating object using default constructor
        Test obj1 = new Test();

        System.out.println("Displaying values for obj1:");
        obj1.display();

        // Reading value of i for obj2
        System.out.print("Enter a value for i: ");
        int a = sc.nextInt();

        // Creating object using one-parameter constructor
        Test obj2 = new Test(a);

        System.out.println("Displaying values for obj2:");
        obj2.display();

        // Reading values of i and j for obj3
        System.out.print("Enter a value for i: ");
        int b = sc.nextInt();

        System.out.print("Enter a value for j: ");
        int c = sc.nextInt();

        // Creating object using two-parameter constructor
        Test obj3 = new Test(b, c);

        System.out.println("Displaying values for obj3:");
        obj3.display();

    }
}