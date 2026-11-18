package UNIT3.Interface;
//WAP in Java to demonstrate accessing interface variables to calculate the area of a room.

interface Dimensions {
    
    //Declaring and initializing the interface variables
    int x = 20;
    int y = 20;
}

class Room implements Dimensions {
    
    //Defining the method to calculate the area
    int area() {
        return x * y;
    }
}

public class VariablesInterfaces2 {
    
    public static void main(String arg[]) {
        
        //Creating an object of Room class
        Room r = new Room();

        //Calling the area() method and displaying the result
        System.out.println("Area:" + r.area());
    }
}