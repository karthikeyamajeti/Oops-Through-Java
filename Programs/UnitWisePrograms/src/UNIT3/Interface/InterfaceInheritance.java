package UNIT3.Interface;
//WAP in Java to demonstrate multilevel and multiple inheritance using interfaces.

interface One {
    
    //Declaring and initializing the PI variable
    double PI = 3.14;
}

interface Two extends One {
    
    //Declaring and initializing the radius variable
    double radius = 2;
}

interface Three extends One, Two {
    
    //Declaring the abstract method
    double area();
}

class Circle1 implements Three {
    
    //Implementing the area() method
    public double area() {
        return PI * radius * radius;
    }
}

public class InterfaceInheritance {
    
    public static void main(String ar[]) {
        
        //Creating an object of Circle1 class
        Circle1 c = new Circle1();

        //Calling the area() method and displaying the result
        System.out.println("Area:" + c.area());
    }
}