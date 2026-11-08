package UNIT3;
import java.util.*;
//WAP to demonstrate Vector in Java to store heterogeneous elements.

public class VectorDemonstration{

    public static void main(String arg[]){

        //Creating a Vector object.
        //Vector is used to store heterogeneous elements.
        Vector v=new Vector();

        //Adding an integer element to the Vector.
        v.add(10);

        //Adding a String element to the Vector.
        v.add("Hello");

        //Adding a double element to the Vector.
        v.add(10.5);

        //Displaying the elements of the Vector.
        System.out.println(v);
    }
}