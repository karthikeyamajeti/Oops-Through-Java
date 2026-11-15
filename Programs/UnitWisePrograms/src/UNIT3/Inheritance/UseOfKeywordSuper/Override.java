package UNIT3.Inheritance.MethodOverriding;
//WAP in Java to demonstrate method overriding in inheritance.
//Defining the superclass A
class A {

    //Declaring instance variables
    int i, j;

    //Defining the parameterized constructor
    A(int a, int b) {

        //Initializing instance variables
        i = a;
        j = b;
    }

    //Defining a method to display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

//Defining class B by extending class A
class B extends A {

    //Declaring an instance variable
    int k;

    //Defining the parameterized constructor
    B(int a, int b, int c) {

        //Calling the superclass A constructor
        super(a, b);

        //Initializing the variable k
        k = c;
    }

    //Overriding the show() method of class A
    void show() {

        //Displaying the value of k
        System.out.println("k: " + k);
    }
}
public class Override {
    
    public static void main(String args[]) {

        //Creating an object of class B
        B subOb = new B(1, 2, 3);

        //Calling the overridden show() method of class B
        subOb.show();

    }
}