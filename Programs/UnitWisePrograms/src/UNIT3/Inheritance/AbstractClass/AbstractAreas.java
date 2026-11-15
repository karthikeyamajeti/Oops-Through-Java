package UNIT3.Inheritance.AbstractClass;
//WAP in Java to demonstrate the use of abstract class to calculate the areas of Rectangle and Triangle.
//Defining an abstract class Figure
abstract class Figure {

    //Declaring instance variables
    double dim1;
    double dim2;

    //Defining the parameterized constructor
    Figure(double a, double b) {

        //Initializing instance variables
        dim1 = a;
        dim2 = b;
    }

    //Declaring an abstract method to calculate area
    abstract double area();
}

//Defining class Rectangle by extending Figure
class Rectangle extends Figure {

    //Defining the parameterized constructor
    Rectangle(double a, double b) {

        //Calling the superclass Figure constructor
        super(a, b);
    }

    //Implementing the area() method to calculate rectangle area
    @Override
    double area() {

        System.out.println("Inside Area for Rectangle.");

        //Returning the area of Rectangle
        return dim1 * dim2;
    }
}

//Defining class Triangle by extending Figure
class Triangle extends Figure {

    //Defining the parameterized constructor
    Triangle(double a, double b) {

        //Calling the superclass Figure constructor
        super(a, b);
    }

    //Implementing the area() method to calculate triangle area
    @Override
    double area() {

        System.out.println("Inside Area for Triangle.");

        //Returning the area of Triangle
        return (dim1 * dim2) / 2;
    }
}

//Defining the main class
public class AbstractAreas {

    public static void main(String args[]) {

        //Creating objects of Rectangle and Triangle
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        //Declaring a reference variable of abstract class Figure
        Figure figref;

        //Assigning the Rectangle object to the Figure reference
        figref = r;

        //Calling the area() method of Rectangle
        System.out.println("Area is " + figref.area());

        //Assigning the Triangle object to the Figure reference
        figref = t;

        //Calling the area() method of Triangle
        System.out.println("Area is " + figref.area());

    }
}