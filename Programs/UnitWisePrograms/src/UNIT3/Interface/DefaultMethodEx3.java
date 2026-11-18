package UNIT3.Interface;
//WAP in Java to demonstrate overriding of default methods in interfaces.

interface Interface1 {
    
    //Declaring the abstract method
    void interface1();

    //Defining the default method
    default void show(int x) {
        System.out.println("Default Method of Interface1 " + x);
    }
    
}

interface Interface2 extends Interface1 {
    
    //Declaring the abstract method
    void interface2();

    //Overriding the default method of Interface1
    default void show(int x) {
        
        //Calling the default method of the parent interface
        Interface1.super.show(10);

        System.out.println("Default Method of Interface2 " + x);
    }
}

class DefaultMethodTestClass implements Interface1, Interface2 {
    
    //Implementing the Interface1 method
    public void interface1() {
        System.out.println("Interface1 method implemented in TC");
    }

    //Implementing the Interface2 method
    public void interface2() {
        System.out.println("Interface2 method implemented in TC");
    }
}

public class DefaultMethodEx3 {
    
    public static void main(String args[]) {
        
        //Creating an object of DefaultMethodTestClass
        DefaultMethodTestClass d = new DefaultMethodTestClass();

        //Calling the implemented interface methods
        d.interface1();
        d.interface2();

        //Calling the overridden default method
        d.show(10);
        d.show(10);
    }
}