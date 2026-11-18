package UNIT3.Arrays.ArraysAsVectors;
//WAP in Java to demonstrate various predefined methods of Vector class.
import java.util.*;
public class VectorMethods {

    public static void main(String args[]) {

        //Creating an empty Vector using Generics
        Vector<Integer> v = new Vector<>();

        //Adding elements to the Vector using add() method
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        
        //Adding an element using addElement() method
        v.addElement(500);

        //Adding more elements to the Vector
        v.add(600);
        v.add(700);

        //Adding an element at the specified index using add() method
        v.add(0, 50);

        //Displaying the size of the Vector
        System.out.println("Size of the vector:" + v.size());

        //Displaying the capacity of the Vector
        System.out.println("Capacity of the vector:" + v.capacity());

        //Displaying all the elements of the Vector
        System.out.println("Values in vector: " + v);

        //Displaying the first element of the Vector
        System.out.println("First Element of the vector: " + v.firstElement());

        //Displaying the last element of the Vector
        System.out.println("Last Element of the vector: " + v.lastElement());

        //Removing the element at the second index using remove() method
        System.out.println("Removes Second location value: " + v.remove(2));

        //Accessing an element using get() method
        System.out.println("Use of get():" + v.get(1));

        //Displaying the Vector elements after removing an element
        System.out.println("Values in vector: " + v);

        //Creating an Enumeration object to access Vector elements
        Enumeration<Integer> e = v.elements();

        //Displaying the elements using Enumeration
        System.out.println("Data in enumeration object is: ");

        //Checking and accessing elements using Enumeration methods
        while(e.hasMoreElements()) {
            System.out.print(e.nextElement() + "  ");
        }

        //Removing all elements from the Vector using clear() method
        v.clear();

        //Displaying the Vector after clearing all elements
        System.out.println("\nAfter Clearing -Values in vector: " + v);

    }
}