//WAP to demonstrate Nested Interface.

interface Shape{
    //Abstract method of Shape interface.
    double getArea(double x);

    //Nested interface Display.
    interface Display{
        //Abstract method of Display interface.
        public void show();
    }
}

class ABC implements Shape.Display {
    
    //Implementing the show() method of nested interface Display.
    public void show(){
        
        System.out.println("Hi Welcome");
        
    }
}

public class NestedInterface2{
    
    public static void main(String args[]) {
        
        //Creating an object of ABC class.
        ABC a = new ABC();

        //Calling the implemented show() method.
        a.show();
        
    }
}