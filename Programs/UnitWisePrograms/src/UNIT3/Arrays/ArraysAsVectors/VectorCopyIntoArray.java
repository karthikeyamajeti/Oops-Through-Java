package UNIT3.Arrays.ArraysAsVectors;
//WAP in Java to demonstrate copying Vector elements into an array using copyInto() method.
import java.util.*;
public class VectorCopyIntoArray {

    public static void main(String[] args) {

        //Creating an empty Vector using Generics
        Vector<Integer> v = new Vector<>();

        //Adding elements to the Vector
        v.add(10);
        v.add(20);
        v.add(30);

        //Declaring and allocating memory for an Object array
        Object[] arr = new Object[3];

        //Copying Vector elements into the Object array using copyInto() method
        v.copyInto(arr);

        //Displaying the copied array elements using Arrays.toString()
        System.out.println(Arrays.toString(arr));

    }
}