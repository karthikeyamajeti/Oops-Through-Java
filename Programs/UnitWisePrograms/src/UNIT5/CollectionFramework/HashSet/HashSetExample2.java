package UNIT5.CollectionFramework.HashSet;
//WAP in Java to merge two HashSets into a single HashSet.

import java.util.HashSet;

public class HashSetExample2 {

    public static void main(String[] args) {

        //Creating the first HashSet of Strings
        HashSet<String> hs1 = new HashSet<>();

        //Adding elements to the first HashSet
        hs1.add("Apple");
        hs1.add("Banana");
        hs1.add("Cherry");

        //Creating the second HashSet of Integers
        HashSet<Integer> hs2 = new HashSet<>();

        //Adding elements to the second HashSet
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);

        //Creating a new HashSet to hold the merged elements
        HashSet<Object> mergedset = new HashSet<>();

        //Adding all elements from the first HashSet
        mergedset.addAll(hs1);

        //Adding all elements from the second HashSet
        mergedset.addAll(hs2);

        //Displaying the merged HashSet
        System.out.println("Merged Set: " + mergedset);

    }
}