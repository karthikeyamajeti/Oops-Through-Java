package UNIT5.CollectionFramework.ArrayList;
//WAP in Java to merge two ArrayLists into a single ArrayList.

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {

        //Creating the first ArrayList of Strings
        ArrayList<String> list1 = new ArrayList<>();

        //Adding elements to the first ArrayList
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        //Creating the second ArrayList of Integers
        ArrayList<Integer> list2 = new ArrayList<>();

        //Adding elements to the second ArrayList
        list2.add(1);
        list2.add(2);
        list2.add(3);

        //Creating a new ArrayList to hold the merged elements
        ArrayList<Object> mergedList = new ArrayList<>();

        //Adding all elements from the first ArrayList
        mergedList.addAll(list1);

        //Adding all elements from the second ArrayList
        mergedList.addAll(list2);

        //Displaying the merged ArrayList
        System.out.println("Merged List: " + mergedList);

    }
}