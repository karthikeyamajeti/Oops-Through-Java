package UNIT3.Interface;
//WAP in Java to demonstrate interface reference using Square and Circle classes.

interface SurfaceArea {
    
    //Declaring the abstract method
    double compute(double x);
}

class Square implements SurfaceArea {
    
    //Implementing the compute() method to calculate square area
    public double compute(double x) {
        return x * x;
    }
}

class Circle implements SurfaceArea {
    
    //Implementing the compute() method to calculate circle area
    public double compute(double x) {
        return (3.14 * x * x);
    }
}

public class InterfaceReference {
    
    public static void main(String arg[]) {
        
        //Creating objects of Square and Circle classes
        Square s = new Square();
        Circle c = new Circle();

        //Declaring an interface reference variable
        SurfaceArea sa;

        //Assigning Square object to interface reference
        sa = s;
        System.out.println("Area of Square:" + sa.compute(5));

        //Assigning Circle object to interface reference
        sa = c;
        System.out.println("Area of Circle:" + sa.compute(5));
    }
}