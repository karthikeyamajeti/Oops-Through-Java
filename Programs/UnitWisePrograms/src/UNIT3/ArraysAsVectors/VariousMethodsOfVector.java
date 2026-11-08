package UNIT3;
import java.util.*;
//WAP to demonstrate various methods of Vector in Java.
public class VariousMethodsOfVector{

    public static void main(String arg[]){

        //Creating an empty Vector.
        Vector<Integer> v=new Vector<>();

        //Adding elements to the Vector.
        v.add(100);

        v.add(200);

        v.add(300);

        v.add(400);

        //Adding an element using addElement() method.
        v.addElement(500);

        v.add(600);

        v.add(700);

        //Adding an element at the specified index.
        v.add(0,50);

        //Displaying the size of the Vector.
        System.out.println("Size of the vector: "+v.size());

        //Displaying the capacity of the Vector.
        System.out.println("Capacity of the vector: "+v.capacity());

        //Displaying all the elements of the Vector.
        System.out.println("Values in vector: "+v);

        //Displaying the first element of the Vector.
        System.out.println("First Element of the vector: "+v.firstElement());

        //Displaying the last element of the Vector.
        System.out.println("Last Element of the vector: "+v.lastElement());

        //Removing the element at the second index.
        System.out.println("Removes Second location value: "+v.remove(2));

        //Accessing an element using get() method.
        System.out.println("Use of get(): "+v.get(1));

        //Displaying the Vector elements after remove() method.
        System.out.println("Values in vector: "+v);

        //Creating an Enumeration object to access Vector elements.
        Enumeration<Integer> e=v.elements();

        //Displaying the elements using Enumeration.
        System.out.println("Data in enumeration object is: ");

        //Traversing the Vector using Enumeration.
        while(e.hasMoreElements()){

            //Printing each element.
            System.out.print(e.nextElement()+"  ");
        }

        //Removing all elements from the Vector.
        v.clear();

        //Displaying the Vector after clearing.
        System.out.println("\nAfter Clearing - Values in vector: "+v);
    }
}