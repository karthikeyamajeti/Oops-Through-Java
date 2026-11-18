package UNIT5.MultiThreadedProgramming.HashSet;
//WAP in Java to demonstrate how HashSet handles duplicate elements.

import java.util.HashSet;

public class HashSetExample4 {

    public static void main(String[] args) {

        //Creating the first HashSet
        HashSet<String> hs1 = new HashSet<>();

        //Adding elements to the HashSet
        hs1.add("Apple");
        hs1.add("Banana");
        hs1.add("Cherry");

        //Attempting to add a duplicate element
        System.out.println(hs1.add("Cherry"));

        //Displaying the HashSet
        System.out.println(hs1);

    }
}