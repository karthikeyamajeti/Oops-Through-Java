//WAP to demonstrate Inheritance in Interfaces.

interface One{
    //Declaring a constant PI.
    double PI = 3.14;
}

interface Two extends One{
    
    //Declaring a constant radius.
    double radius = 2;
    
}

interface Three extends One, Two{
    //Abstract method to calculate area.
    double area();
}

class Circle1 implements Three{
    
    //Implementing the area() method.
    public double area(){
        return PI * radius * radius;
    }
    
}

public class Interface_Inheritance{
    
    public static void main(String args[]) {
        
        //Creating an object of Circle1 class.
        Circle1 c = new Circle1();

        //Displaying the area of the circle.
        System.out.println("Area: " + c.area());
    }
}