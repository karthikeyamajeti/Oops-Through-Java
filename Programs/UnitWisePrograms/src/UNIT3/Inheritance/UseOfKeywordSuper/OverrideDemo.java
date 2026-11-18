package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate method overriding in inheritance.
//Defining the superclass A
class ParentOverride{

    //Declaring instance variables
    int i, j;

    //Defining the parameterized constructor
    ParentOverride(int a, int b) {

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
class ChildOverride extends ParentOverride {

    //Declaring an instance variable
    int k;

    //Defining the parameterized constructor
    ChildOverride(int a, int b, int c) {

        //Calling the superclass A constructor
        super(a, b);

        //Initializing the variable k
        k = c;
    }

    //Overriding the show() method of class A
    void show() {
        super.show();
        //Displaying the value of k
        System.out.println("k: " + k);
    }
}
public class OverrideDemo {
    
    public static void main(String args[]) {

        //Creating an object of class B
        ChildOverride subOb = new ChildOverride(1, 2, 3);

        //Calling the overridden show() method of class B
        subOb.show();

    }
}