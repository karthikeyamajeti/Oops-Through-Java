package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the calling of superclass constructor using super() in inheritance.
//Defining the superclass Vehicle
class Vehicle {

    //Defining the constructor of class Vehicle
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

//Defining class Bike by extending class Vehicle
class Bike extends Vehicle {

    //Defining the constructor of class Bike
    Bike() {

        //Calling the superclass Vehicle constructor
        super();

        System.out.println("Bike is created");
    }
}
public class SuperClassConst {

    public static void main(String args[]) {

        //Creating an object of class Bike
        Bike b = new Bike();

    }
}