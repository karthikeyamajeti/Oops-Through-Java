package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the order in which constructors are called in multilevel inheritance.
//Defining the superclass A1
class A1 {

    //Defining the constructor of class A1
    A1() {
        System.out.println("Inside A's constructor.");
    }
}

//Defining class B1 by extending class A1
class B1 extends A1 {

    //Defining the constructor of class B1
    B1() {
        System.out.println("Inside B's constructor.");
    }
}

//Defining class C1 by extending class B1
class C1 extends B1 {

    //Defining the constructor of class C1
    C1() {
        System.out.println("Inside C's constructor.");
    }
}

//Defining class D1 by extending class C1
class D1 extends C1 {

    //Defining the constructor of class D1
    D1() {
        System.out.println("Inside D's constructor.");
    }
}

public class ConstructorCalling {

    public static void main(String args[]) {

        //Creating an object of class D1
        D1 d = new D1();

    }
}