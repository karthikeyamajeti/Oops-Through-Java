package UNIT3.Inheritance.UseOfKeyWordFinal;
//WAP in Java to demonstrate the use of final variable.
/*
class Bike1 {

    final int speed_limit = 30;

    void run() {
        speed_limit = speed_limit + 20; //error
        System.out.println("Vehicle running safely with:" + speed_limit + " kmph");
    }
}

public class FinalVariable {

    public static void main(String args[]) {
        
        //Creating object for Class Bike1
        Bike1 b = new Bike1();

        //Calling run method
        b.run();

    }
}
*/

/*
Changes that need to be made before executing the program

Your original program produces a compilation error because:

1. The speed_limit variable is declared as final.
2. A final variable cannot be reassigned after initialization.
3. Therefore, remove the statement speed_limit = speed_limit + 20.
4. Use the initialized value of speed_limit directly.
5. Create an object of Bike1 class and call the run() method.
*/

class Bike1 {

    //Declaring and initializing a final variable
    final int speed_limit = 30;

    //Defining a method to display vehicle speed
    void run() {

        //Displaying the value of final variable
        System.out.println("Vehicle running safely with:" + speed_limit + " kmph");
    }
}

public class FinalVariable {

    public static void main(String args[]) {

        //Creating an object of Bike1 class
        Bike1 b = new Bike1();

        //Calling the run() method using Bike1 object
        b.run();

    }
}