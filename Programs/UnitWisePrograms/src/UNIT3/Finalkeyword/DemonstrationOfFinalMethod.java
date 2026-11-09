//WAP to demonstrate Final Method.
class Vehicle2{
    //Declaring a final method.
    final void run(){
        System.out.println("running");
    }
}

class Bike2 extends Vehicle2{
    //The final run() method cannot be overridden.
}

public class DemonstrationOfFinalMethod{
    
    public static void main(String args[]){
        //Creating an object of child class Bike2.
        Bike2 b = new Bike2();

        //Calling the inherited final method.
        b.run();
    }
}