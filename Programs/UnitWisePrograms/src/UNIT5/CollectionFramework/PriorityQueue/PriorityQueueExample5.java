package UNIT5.CollectionFramework.PriorityQueue;
//WAP in Java to demonstrate a PriorityQueue of Student objects using Comparator to arrange students by name in ascending order.

import java.util.Comparator;
import java.util.PriorityQueue;

//Creating a Student class
class Student {

    String name;
    int marks;

    //Creating a constructor to initialize student details
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

//Creating a Comparator class to compare students by name
class MyComparator implements Comparator<Student> {

    //Comparing students in ascending order of name
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class PriorityQueueExample5 {

    public static void main(String[] args) {

        //Creating a PriorityQueue using MyComparator
        PriorityQueue<Student> pq = new PriorityQueue<>(new MyComparator());

        //Adding Student objects to the PriorityQueue
        pq.add(new Student("Ravi", 85));
        pq.add(new Student("Sita", 95));
        pq.add(new Student("Ram", 75));

        //Displaying students in ascending order of name
        while(!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " - " + s.marks);
        }

    }
}