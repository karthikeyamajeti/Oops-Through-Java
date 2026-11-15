package UNIT3.Inheritance.AbstractClass;
//WAP in Java to demonstrate abstract methods and concrete methods in an abstract class.
//Defining an abstract class A
abstract class A {

    //Declaring an abstract method
    abstract void callme();

    //Defining a concrete method
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

//Defining class B by extending abstract class A
class B extends A {

    //Implementing the abstract method of class A
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

//Defining the main class
public class AbstractDemo {

    public static void main(String args[]) {

        //Creating an object of class B
        B b = new B();

        //Calling the implemented abstract method
        b.callme();

        //Calling the concrete method inherited from class A
        b.callmetoo();

    }
}