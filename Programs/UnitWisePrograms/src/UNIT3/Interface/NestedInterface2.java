package UNIT3.Interface;
//WAP in Java to demonstrate implementing a nested interface.

interface Shape {
    
    //Declaring the abstract method
    double getArea(double x);

    //Declaring a nested interface
    interface Display {
        public void show();
    }
}

class ABC implements Shape.Display {
    
    //Implementing the show() method of nested interface
    public void show() {
        System.out.println("Hi Welcome");
    }
}

public class NestedInterface2 {
    
    public static void main(String arg[]) {
        
        //Creating an object of ABC class
        ABC a = new ABC();

        //Calling the show() method
        a.show();
    }
}