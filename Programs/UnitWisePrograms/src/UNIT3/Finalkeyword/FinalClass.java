//WAP to demonstrate Final Class.
final class Vehicle{
    //Method of final class Vehicle.
    void run(){
        System.out.println("running");
    }
}

//Error: A final class cannot be inherited.
//class Bike extends Vehicle
//{
//    void run()
//    {
//        System.out.println("running safely with 100kmph");
//    }
//}

public class FinalClass {
    
    public static void main(String args[]){
        //Creating an object of final class Vehicle.
        Vehicle v = new Vehicle();

        //Calling the run() method.
        v.run();
    }
}