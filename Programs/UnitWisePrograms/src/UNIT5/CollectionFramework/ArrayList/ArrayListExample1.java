package UNIT5.CollectionFramework.ArrayList;
//WAP in Java to demonstrate the various operations of an ArrayList.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

    public static void main(String[] args) {

        //Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        //Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Adding an element at a specific index
        fruits.add(1, "Blueberry");

        //Printing the ArrayList
        System.out.println("Fruits list: " + fruits);

        //Accessing an element by index
        String fruit = fruits.get(2);
        System.out.println("Fruit at index 2: " + fruit);

        //Updating an element at a specific index
        fruits.set(2, "Mango");
        System.out.println("After update: " + fruits);

        //Removing an element by index
        fruits.remove(1);
        System.out.println("After removing element at index 1: " + fruits);

        //Checking if an element is present in the list
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("Contains Cherry? " + hasCherry);

        //Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        //Iterating over elements using a for-each loop
        System.out.print("Fruits: ");
        for(String f : fruits) {
            System.out.print(f + " ");
        }

        System.out.println();

        //Printing the ArrayList using an Iterator
        System.out.print("Fruits list using Iterator: ");
        Iterator<String> i = fruits.iterator();

        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        //Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("\nAfter clearing the list: " + fruits);

    }
}