package UNIT3;
import java.util.*;
//WAP to demonstrate the copyInto() method of Vector to copy Vector elements into an array.

public class CopyIntoMethodOfVector{

    public static void main(String arg[]){

        //Creating a Vector object to store Integer elements.
        Vector<Integer> v=new Vector<>();

        //Adding elements to the Vector.
        v.add(10);
        v.add(20);
        v.add(30);

        //Declaring an Object array of size 3.
        Object arr[]=new Object[3];

        //Copying Vector elements into the Object array.
        v.copyInto(arr);

        //Displaying the elements of the array.
        System.out.println(Arrays.toString(arr));
    }
}