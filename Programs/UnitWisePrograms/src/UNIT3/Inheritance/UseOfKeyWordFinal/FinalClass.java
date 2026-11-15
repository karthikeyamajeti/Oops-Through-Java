package UNIT3.Inheritance.UseOfKeyWordFinal;
//WAP in Java to demonstrate the use of final class.
/*
final class Vehicle {

    //Defining a method to display vehicle information
    void run() {
        System.out.println("running");
    }
}

//Attempting to inherit the final Vehicle class (Compilation Error)
class Bike extends Vehicle {

    //Overriding the run() method of Vehicle class
    void run() {
        System.out.println("running safely with 100kmph");
    }
}

public class FinalClass {

    public static void main(String args[]) {

        //Creating an object of Bike class
        Bike b = new Bike();

        //Calling the run() method using Bike object
        b.run();

    }
}
*/
/*
Changes that need to be made before executing the program
Your original program produces a compilation error because:
1. Vehicle is declared as a final class.
2. A final class cannot be inherited by another class.
3. Therefore, class Bike extends Vehicle must be removed.
4. Create an object of the Vehicle class instead of the Bike class.
5. Call the run() method using the Vehicle object.
*/
final class Vehicle {

    //Defining a method to display vehicle information
    void run() {
        System.out.println("running");
    }
}

public class FinalClass {

    public static void main(String args[]) {

        //Creating an object of Vehicle class
        Vehicle v = new Vehicle();

        //Calling the run() method using Vehicle object
        v.run();

    }
}