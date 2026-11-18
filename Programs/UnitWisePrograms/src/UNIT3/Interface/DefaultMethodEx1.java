package UNIT3.Interface;
//WAP in Java to demonstrate default methods in an interface.

interface TestInterface {
    
    //Declaring the abstract method
    void square(int a);

    //Defining the default method
    default void show(){
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface {
    
    //Implementing the square abstract method
    public void square(int a)  {
        System.out.println("Square:" + a * a);
    }
    
}

public class DefaultMethodEx1 {
    
    public static void main(String args[])   {
        
        //Creating an object of TestClass
        TestClass d = new TestClass();

        //Calling the implemented abstract method
        d.square(4);

        //Calling the default method
        //d.show();
    }
}