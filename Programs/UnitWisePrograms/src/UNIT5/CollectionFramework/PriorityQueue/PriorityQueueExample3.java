package UNIT5.CollectionFramework.PriorityQueue;
//WAP in Java to demonstrate merging two heterogeneous PriorityQueues.

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample3 {

    public static void main(String[] args) {

        //Creating the first PriorityQueue of Integers
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        //Adding elements to the first PriorityQueue
        pq1.add(10);
        pq1.add(5);
        pq1.add(20);

        //Displaying the first PriorityQueue
        System.out.println("First PQ Elements: " + pq1);

        //Creating the second PriorityQueue of Strings
        PriorityQueue<String> pq2 = new PriorityQueue<>();

        //Adding elements to the second PriorityQueue
        pq2.add("Banana");
        pq2.add("Apple");
        pq2.add("Cherry");

        //Displaying the second PriorityQueue
        System.out.println("Second PQ Elements: " + pq2);

        //Creating a PriorityQueue of Objects using a custom Comparator
        PriorityQueue<Object> pq3 = new PriorityQueue<>(
            Comparator.comparing(Object::toString)
        );

        //Adding all elements from the first PriorityQueue
        pq3.addAll(pq1);

        //Adding all elements from the second PriorityQueue
        pq3.addAll(pq2);

        //Displaying the merged PriorityQueue
        System.out.println("Merged PQ Elements: " + pq3);

    }
}