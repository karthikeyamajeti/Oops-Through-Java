package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the order in which constructors are called in multilevel inheritance.
//Defining the superclass A
class A {

    //Defining the constructor of class A
    A() {
        System.out.println("Inside A's constructor.");
    }
}

//Defining class B by extending class A
class B extends A {

    //Defining the parameterized constructor of class B
    B(int x) {

        //Calling the superclass A constructor
        super();

        System.out.println("Inside B's constructor." + x);
    }
}

//Defining class C by extending class B
class C extends B {

    //Defining the constructor of class C
    C() {

        //Calling the superclass B constructor with argument 200
        super(200);

        System.out.println("Inside C's constructor.");
    }
}
public class CallingConstructor {

    public static void main(String args[]) {

        //Creating an object of class C
        C c = new C();

    }
}