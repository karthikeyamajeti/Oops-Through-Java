package UNIT3.Arrays.ArraysAsVectors;
//WAP in Java to demonstrate storing heterogeneous elements using Vector.
import java.util.*;
public class VectorHeterogeneousElements {

    public static void main(String a[]) {

        //Creating a Vector object using Generics to store different types of elements
        Vector<Object> v = new Vector<>();

        //Adding an integer element to the Vector
        v.add(10);

        //Adding a String element to the Vector
        v.add("Hello");

        //Adding a double element to the Vector
        v.add(10.5);

        //Displaying all the elements of the Vector
        System.out.println(v);

    }
}