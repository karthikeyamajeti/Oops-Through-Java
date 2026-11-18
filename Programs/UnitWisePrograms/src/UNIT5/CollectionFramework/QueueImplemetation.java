package UNIT3.Collections.Queue;
//WAP in Java to demonstrate the implementation of a Queue using LinkedList.

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplemetation {

    public static void main(String[] args) {

        //Creating a Queue using LinkedList
        Queue<String> q = new LinkedList<>();

        //Adding elements to the Queue
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");

        //Displaying the Queue elements
        System.out.println(q);

    }
}