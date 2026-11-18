package UNIT3.Interface;
//WAP in Java to demonstrate implementing an interface using a class.

interface Moveable {
    
    //Declaring and initializing the interface variable
    int AVG_SPEED = 0;

    //Declaring the abstract method
    void move();
}

class Move implements Moveable {
    
    //Implementing the move() method
    public void move() {
        System.out.println("Average speed is: " + AVG_SPEED);
    }
}

public class Vehicle {
    
    public static void main(String[] arg) {
        
        //Creating an object of Move class
        Move m = new Move();

        //Calling the move() method
        m.move();
    }
}