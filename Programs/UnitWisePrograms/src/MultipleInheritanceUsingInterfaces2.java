//WAP to demonstrate Multiple Inheritance using Interfaces.

interface Teacher1{
    //Abstract method of Teacher1 interface.
    void display1();
}

interface Student1{
    //Abstract method of Student1 interface.
    void display2();
}

class College1 implements Teacher1, Student1{
    
    //Implementing the display1() method of Teacher1 interface.
    public void display1() {
        System.out.println("Hi I am Teacher");
    }

    //Implementing the display2() method of Student1 interface.
    public void display2() {
        System.out.println("Hi I am Student");
    }
}

public class MultipleInheritanceUsingInterfaces2{
    
    public static void main(String args[])  {
        //Creating an object of College1 class.
        College1 c = new College1();

        //Calling the implemented interface methods.
        c.display1();
        c.display2();
    }
}