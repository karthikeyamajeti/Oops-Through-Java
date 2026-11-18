package UNIT3.Interfaces;
//WAP in Java to demonstrate default methods in interfaces.

interface Interface1{
    //Declaring the abstract method
    void interface1();

    //Defining a default method with an integer parameter
    default void show(int x){
        System.out.println("Default Method of Interface 1 " + x);
    }
}

interface Interface2{
    
    //Declaring the abstract method
    void interface2();

    //Defining a default method with a double parameter
    default void show(double x){
        System.out.println("Default Method of Interface 2 " + x);
    }
}

class TestClass implements Interface1, Interface2{
    
    //Implementing the Interface1 method
    public void interface1(){
        System.out.println("Interface 1 method implemented in TC");
    }

    //Implementing the Interface2 method
    public void interface2() {
        System.out.println("Interface 2 method implemented in TC");
    }
}

public class DefaultMethodEx {
    
    public static void main(String args[]) {
        
        //Creating an object of TestClass
        TestClass d = new TestClass();

        //Calling the implemented interface methods
        d.interface1();
        d.interface2();

        //Calling the default method of Interface1
        d.show(10);
    }
}