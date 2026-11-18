package UNIT3.Interface;
//WAP in Java to demonstrate static methods in interfaces.

interface NewInterface {
    
    //Defining the static method
    static void staticMethod() {
        System.out.println("Hello, I am Static Method");
    }

    //Declaring the abstract method
    void overrideMethod(String str);
}

public class StaticMethodDemo implements NewInterface {
    
    //Implementing the interface method
    @java.lang.Override
    public void overrideMethod(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        
        //Creating an object of StaticMethodDemo
        StaticMethodDemo s = new StaticMethodDemo();

        //Calling the implemented interface method
        s.overrideMethod("Hello, I am override Method");

        //Calling the static method using the interface name
        NewInterface.staticMethod();
    }
}