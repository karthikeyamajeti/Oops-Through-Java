package UNIT5.CollectionFramework.PriorityQueue;
//WAP in Java to demonstrate a PriorityQueue of Employee objects using Comparator to arrange employees by name in descending order.

import java.util.Comparator;
import java.util.PriorityQueue;

//Creating an Employee4 class
class Employee4 {

    int id;
    String name;
    double salary;

    //Creating a constructor to initialize employee details
    Employee4(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Overriding toString() to display employee details
    @java.lang.Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name +
               ", Salary=" + salary + "]";
    }
}

//Creating a Comparator class to compare employees by name
class MyComparator4 implements Comparator<Employee4> {

    //Comparing employees in descending order of name
    public int compare(Employee4 e1, Employee4 e2) {
        return e2.name.compareTo(e1.name);
    }
}

public class PriorityQueueExample4 {

    public static void main(String[] args) {

        //Creating a PriorityQueue using MyComparator4
        PriorityQueue<Employee4> pq = new PriorityQueue<>(new MyComparator4());

        //Adding Employee4 objects to the PriorityQueue
        pq.add(new Employee4(1, "Saadvi", 40000));
        pq.add(new Employee4(2, "Suresh", 60000));
        pq.add(new Employee4(3, "Kalpana", 85000));

        //Displaying employees in descending order of name
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}