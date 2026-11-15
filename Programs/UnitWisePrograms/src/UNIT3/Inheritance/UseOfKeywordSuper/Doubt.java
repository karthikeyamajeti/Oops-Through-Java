package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the use of super keyword to access superclass variables in multilevel inheritance.
//Defining the superclass A3
class A3 {

    //Declaring and initializing the variable x
    int x = 10;
}

//Defining class B3 by extending class A3
class B3 extends A3 {

    //Declaring and initializing the variable x
    int x = 30;
}

//Defining class C3 by extending class B3
class C3 extends B3 {

    //Declaring and initializing the variable x
    int x = 100;

    //Defining a method to display the variable values
    void display() {

        //Accessing the current class variable
        System.out.println(x);

        //Accessing the immediate parent class variable
        System.out.println(super.x);

        //Accessing the grandparent class variable using type casting
        System.out.println(((A3)this).x);

    }
}
public class Doubt {

    public static void main(String arg[]) {

        //Creating an object of class C3
        C3 c = new C3();

        //Calling the display() method
        c.display();

    }
}