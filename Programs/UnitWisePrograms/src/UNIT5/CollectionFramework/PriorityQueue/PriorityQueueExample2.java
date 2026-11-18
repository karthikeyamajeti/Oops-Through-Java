package UNIT5.CollectionFramework.PriorityQueue;
//WAP in Java to demonstrate a PriorityQueue of Employee objects using a custom Comparator.

import java.util.Comparator;
import java.util.PriorityQueue;

//Creating an Employee class
class Employee {

    int id;
    String name;
    double salary;

    //Creating a constructor to initialize employee details
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Overriding toString() to display employee details
    @java.lang.Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class PriorityQueueExample2 {

    public static void main(String[] args) {

        //Creating a custom Comparator to prioritize employees by salary
        Comparator<Employee> salCompare = new Comparator<Employee>() {

            @java.lang.Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        };

        //Creating a PriorityQueue of Employee objects using the custom Comparator
        PriorityQueue<Employee> e = new PriorityQueue<>(salCompare);

        //Adding Employee objects to the PriorityQueue
        e.add(new Employee(1, "Saadvi", 40000));
        e.add(new Employee(2, "Suresh", 60000));
        e.add(new Employee(3, "Kalpana", 85000));

        //Displaying the PriorityQueue
        System.out.println(e);

    }
}