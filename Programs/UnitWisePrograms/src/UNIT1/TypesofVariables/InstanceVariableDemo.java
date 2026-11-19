package UNIT1.TypesofVariables;
//WAP in Java to demonstrate the use of instance variables in calculating the area of a circle.

class Circle {
    //Declaring instance variables
    double radius = 7;
    final double PI = 3.14159;
    void area() {
    //Calculating the area of the circle using instance variables
	double area = PI * radius * radius;
	//Displaying the calculated area
    System.out.println("Area of Circle = " + area);
    }
}

public class InstanceVariableDemo {
    public static void main(String[] args) {
	//Creating an object of the Circle class
        Circle obj = new Circle();

	//Calling the instance method
	obj.area();
    }
}