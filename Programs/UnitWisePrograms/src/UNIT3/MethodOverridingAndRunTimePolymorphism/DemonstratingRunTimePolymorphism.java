package UNIT3.MethodOverridingAndRunTimePolymorphism;
//WAP to demonstrate run-time polymorphism using method overriding.

class Figure{

    //Declaring instance variables.
    double dim1;
    double dim2;

    //Parameterized constructor to initialize dimensions.
    Figure(double a,double b){

        dim1=a;
        dim2=b;
    }

    //Method to calculate the area of a figure.
    double area(){

        //Displaying a message when area is undefined.
        System.out.println("Area for Figure is undefined.");

        return 0;
    }
}

//Rectangle class inheriting Figure class.
class Rectangle extends Figure{

    //Parameterized constructor.
    Rectangle(double a,double b){

        //Calling the parent class constructor.
        super(a,b);
    }

    //Overriding the area() method.
    @Override
    double area(){

        //Displaying a message.
        System.out.println("Inside Area for Rectangle.");

        //Calculating and returning the area of rectangle.
        return dim1*dim2;
    }
}

//Triangle class inheriting Figure class.
class Triangle extends Figure{

    //Parameterized constructor.
    Triangle(double a,double b){

        //Calling the parent class constructor.
        super(a,b);
    }

    //Overriding the area() method.
    @Override
    double area(){

        //Displaying a message.
        System.out.println("Inside Area for Triangle.");

        //Calculating and returning the area of triangle.
        return (dim1*dim2)/2;
    }
}

public class DemonstratingRunTimePolymorphism{

    public static void main(String arg[]){

        //Creating a reference variable of Figure class.
        Figure figref;

        //Creating an object of Rectangle class.
        Rectangle r=new Rectangle(9,5);

        //Creating an object of Triangle class.
        Triangle t=new Triangle(10,8);

        //Assigning Rectangle object to Figure reference.
        figref=r;

        //Calling the overridden area() method of Rectangle class.
        System.out.println("Area is "+figref.area());

        //Assigning Triangle object to Figure reference.
        figref=t;

        //Calling the overridden area() method of Triangle class.
        System.out.println("Area is "+figref.area());
    }
}