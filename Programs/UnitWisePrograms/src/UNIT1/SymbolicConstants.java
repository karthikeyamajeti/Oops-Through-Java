package UNIT1;
//WAP in Java to demonstrate the use of symbolic constants to calculate the perimeter of a circle.
public class SymbolicConstants {
    public static void main(String[] args) {
	//Declaring a symbolic constant PI
	final double PI = 3.1415926535;

        //Declaring and initializing variables
	double radius = 25.0;
	double perimeter;

	//Calculating the perimeter of the circle
	perimeter = 2 * PI * radius;

	//Displaying the radius and perimeter
	System.out.println("Radius = " + radius);
	System.out.println("Perimeter of Circle = " + perimeter);
    }
}