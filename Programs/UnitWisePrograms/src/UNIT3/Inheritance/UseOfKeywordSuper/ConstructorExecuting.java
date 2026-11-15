package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the order in which constructors are executed in multilevel inheritance using parameterized constructors.
//Defining the superclass A2
class A2 {

    //Defining the parameterized constructor of class A2
    A2(int a) {

        //Incrementing the value of a
        a++;

        System.out.println("Inside A's constructor:" + a);
    }
}

//Defining class B2 by extending class A2
class B2 extends A2 {

    //Defining the parameterized constructor of class B2
    B2(int b) {

        //Calling the superclass A2 constructor with argument 9
        super(9);

        //Incrementing the value of b
        b++;

        System.out.println("Inside B's constructor:" + b);
    }
}

//Defining class C2 by extending class B2
class C2 extends B2 {

    //Defining the constructor of class C2
    C2() {

        //Calling the superclass B2 constructor with argument 10
        super(10);

        System.out.println("Inside C's constructor.");
    }
}
public class ConstructorExecuting {

    public static void main(String args[]) {

        //Creating an object of class C2
        C2 c = new C2();

    }
}