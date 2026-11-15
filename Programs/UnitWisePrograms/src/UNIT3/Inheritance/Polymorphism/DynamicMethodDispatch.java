package UNIT3.Inheritance.Polymorphism;
//WAP in Java to demonstrate dynamic method dispatch using method overriding.
//Defining the superclass A
class A {

    //Defining a method callMe()
    void callMe() {
        System.out.println("Inside A");
    }
}

//Defining class B by extending class A
class B extends A {

    //Overriding the callMe() method of class A
    @Override
    void callMe() {
        System.out.println("Inside B");
    }
}

//Defining class C by extending class B
class C extends B {

    //Overriding the callMe() method of class B
    @Override
    void callMe() {
        System.out.println("Inside C");
    }
}

//Defining the main class
public class DynamicMethodDispatch {

    public static void main(String args[]) {

        //Creating objects of classes A, B and C
        A a = new A();
        B b = new B();
        C c = new C();

        //Declaring a reference variable of superclass A
        A ref;

        //Assigning the object of class A to the reference variable
        ref = a;

        //Calling the callMe() method of class A
        ref.callMe();

        //Assigning the object of class B to the reference variable
        ref = b;

        //Calling the overridden callMe() method of class B
        ref.callMe();

        //Assigning the object of class C to the reference variable
        ref = c;

        //Calling the overridden callMe() method of class C
        ref.callMe();

    }
}