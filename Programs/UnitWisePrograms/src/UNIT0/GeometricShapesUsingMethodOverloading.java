package UNIT0;
import java.util.*;
/*
WAP to calculate the areas of a circle, rectangle, and square using method
overloading. Read the required dimensions from the user and display the corresponding areas.
*/
class Shape {

    // Method to calculate the area of a circle
    double calcArea(double r) {
        return Math.PI * r * r;
    }

    // Overloaded method to calculate the area of a rectangle
    double calcArea(double l, double w) {
        return l * w;
    }

    // Overloaded method to calculate the area of a square
    int calcArea(int s) {
        return s * s;
    }
}

public class GeometricShapesUsingMethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of Shape class
        Shape s = new Shape();

        // Reading radius and calculating area of circle
        System.out.print("Enter radius of circle:");
        double radius = sc.nextDouble();
        double res1 = s.calcArea(radius);
        System.out.printf("Area of circle : %.2f\n", res1);

        // Reading length and width and calculating area of rectangle
        System.out.print("Enter length of rectangle:");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle:");
        double width = sc.nextDouble();
        double res2 = s.calcArea(length, width);
        System.out.printf("Area of rectangle : %.2f\n", res2);

        // Reading side and calculating area of square
        System.out.print("Enter side of square:");
        int side = sc.nextInt();
        int res3 = s.calcArea(side);
        System.out.println("Area of square : " + res3);

        // Closing Scanner object
        sc.close();
    }
}