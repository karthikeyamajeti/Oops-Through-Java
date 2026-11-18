package UNIT5.CollectionFramework.HashSet;
//WAP in Java to demonstrate adding and iterating elements using a HashSet.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

    public static void main(String[] args) {

        //Creating a HashSet and adding elements
        HashSet<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        //Displaying the HashSet elements
        System.out.println(set);

        //Creating an Iterator to traverse the HashSet
        Iterator<String> i = set.iterator();

        //Iterating through the HashSet elements
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}