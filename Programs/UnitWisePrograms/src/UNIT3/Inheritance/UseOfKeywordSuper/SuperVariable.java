package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the use of super keyword to access superclass variables.
//Defining the superclass Vehicle1
class Vehicle1 {

    //Declaring and initializing the speed variable
    int speed = 50;
}

//Defining class Bike1 by extending class Vehicle1
class Bike1 extends Vehicle1 {

    //Declaring and initializing the speed variable
    int speed = 100;

    //Defining a method to display the speed values
    void display() {

        //Accessing the superclass Vehicle1 speed variable
        System.out.println("Vehicle Speed:" + super.speed);

        //Accessing the current class Bike1 speed variable
        System.out.println("Bike Speed:" + speed);

    }
}
public class SuperVariable {

    public static void main(String args[]) {

        //Creating an object of class Bike1
        Bike1 b = new Bike1();

        //Calling the display() method
        b.display();

    }
}