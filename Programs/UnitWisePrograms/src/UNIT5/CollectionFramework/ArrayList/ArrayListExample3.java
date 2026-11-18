package UNIT5.MultiThreadedProgramming.ArrayList;
//WAP in Java to demonstrate storing and performing operations on Employee objects using an ArrayList.

import java.util.ArrayList;
import java.util.Iterator;

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

public class ArrayListExample3{

    public static void main(String[] args) {

        //Creating an ArrayList of Employee objects
        ArrayList<Employee> e = new ArrayList<>();

        //Adding Employee objects to the ArrayList
        e.add(new Employee(1, "Saadvi", 50000));
        e.add(new Employee(2, "Suresh", 60000));
        e.add(new Employee(3, "Kalpana", 55000));

        //Displaying all employees using a for-each loop
        System.out.println("Employee List:");
        for(Employee emp : e) {
            System.out.println(emp);
        }

        //Adding another Employee
        e.add(new Employee(4, "Poojitha", 70000));

        //Accessing a specific employee by index
        Employee s_e = e.get(1);
        System.out.println("\nEmployee at index 1: " + s_e);

        //Removing an employee by index
        e.remove(2);

        //Displaying employees after removing an employee
        System.out.println("\nAfter Removing:");
        Iterator<Employee> i = e.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}