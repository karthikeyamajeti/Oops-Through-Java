//WAP to demonstrate Final Variable.
class Bike1{
    //Declaring and initializing a final variable.
    final int speed_limit = 30;

    void run() {
        //Trying to modify the final variable causes a compilation error.
        //speed_limit = speed_limit + 20;

        //Displaying the value of the final variable.
        System.out.println("Vehicle running safely with: " + speed_limit + " kmph");
    }
}

public class DemonstrationOfFinalVariable{
    
    public static void main(String args[]){
        //Creating an object of Bike1 class.
        Bike1 b = new Bike1();

        //Calling the run() method.
        b.run();
    }
}