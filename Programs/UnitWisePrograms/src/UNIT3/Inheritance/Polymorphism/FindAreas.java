package UNIT3.Inheritance.RuntimePolymorphism;
//WAP in Java to demonstrate runtime polymorphism using method overriding to calculate the areas of Rectangle and Triangle.
//Defining the superclass Figure
class Figure {

    //Declaring instance variables
    double dim1;
    double dim2;

    //Defining the parameterized constructor
    Figure(double a, double b) {

        //Initializing instance variables
        dim1 = a;
        dim2 = b;
    }

    //Defining a method to calculate area
    double area() {

        System.out.println("Area for Figure is undefined.");

        //Returning 0 as the default area
        return 0;
    }
}

//Defining class Rectangle by extending class Figure
class Rectangle extends Figure {

    //Defining the parameterized constructor
    Rectangle(double a, double b) {

        //Calling the superclass Figure constructor
        super(a, b);
    }

    //Overriding the area() method of class Figure
    @Override
    double area() {

        System.out.println("Inside Area for Rectangle.");

        //Returning the area of Rectangle
        return dim1 * dim2;
    }
}

//Defining class Triangle by extending class Figure
class Triangle extends Figure {

    //Defining the parameterized constructor
    Triangle(double a, double b) {

        //Calling the superclass Figure constructor
        super(a, b);
    }

    //Overriding the area() method of class Figure
    @Override
    double area() {

        System.out.println("Inside Area for Triangle.");

        //Returning the area of Triangle
        return (dim1 * dim2) / 2;
    }
}

//Defining the main class
public class FindAreas {

    public static void main(String args[]) {

        //Declaring a reference variable of class Figure
        Figure figref;

        //Creating objects of Rectangle and Triangle
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        //Assigning the Rectangle object to the Figure reference
        figref = r;

        //Calling the overridden area() method of Rectangle
        System.out.println("Area is " + figref.area());

        //Assigning the Triangle object to the Figure reference
        figref = t;

        //Calling the overridden area() method of Triangle
        System.out.println("Area is " + figref.area());

    }
}