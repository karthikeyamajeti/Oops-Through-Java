package UNIT5.CollectionFramework.PriorityQueue;
//WAP in Java to demonstrate the operations of a PriorityQueue.

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1 {

    public static void main(String[] args) {

        //Creating a PriorityQueue with natural ordering
        Queue<Integer> pq = new PriorityQueue<>();

        //Adding elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);

        //Displaying the PriorityQueue elements
        System.out.println("Elements: " + pq);

        //Retrieving the head element without removing it
        System.out.println("Head Element: " + pq.peek());

        //Removing the head element from the PriorityQueue
        System.out.println("Removed Element: " + pq.poll());

        //Checking the size of the PriorityQueue
        System.out.println("Size: " + pq.size());

        //Displaying the PriorityQueue after removing the head element
        System.out.println("Elements: " + pq);

    }
}