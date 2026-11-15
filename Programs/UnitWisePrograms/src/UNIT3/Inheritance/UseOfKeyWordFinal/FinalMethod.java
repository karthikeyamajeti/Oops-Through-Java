package UNIT3.Inheritance.UseOfKeywordFinal;
//WAP in Java to demonstrate the use of final method.
/*
class Vehicle2 {

    final void run() {
        System.out.println("running");
    }
}

class Bike2 extends Vehicle2 {

    //Attempting to override the final run() method (Compilation Error)
    void run() {
        System.out.println("running safely with 100 kmph");
    }
}

public class FinalMethod {

    public static void main(String args[]) {
        
        //Creating object for class Bike2 
        Bike2 b = new Bike2();

        //Calling run method
        b.run();

    }
}
*/

/*
Changes that need to be made before executing the program

Your original program produces a compilation error because:

1. The run() method in Vehicle2 is declared as final.
2. A final method cannot be overridden by its subclass.
3. Remove the run() method from the Bike2 class.
4. The Bike2 class can inherit the final run() method from Vehicle2.
5. Create an object of Bike2 class and call the inherited run() method.
*/

class Vehicle2 {

    //Defining a final method to prevent method overriding
    final void run() {
        System.out.println("running");
    }
}

class Bike2 extends Vehicle2 {

    //Inheriting the final run() method from Vehicle2 class
}

public class FinalMethod {

    public static void main(String args[]) {

        //Creating an object of Bike2 class
        Bike2 b = new Bike2();

        //Calling the inherited final run() method
        b.run();

    }
}