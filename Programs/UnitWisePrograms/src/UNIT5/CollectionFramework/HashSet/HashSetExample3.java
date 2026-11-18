package UNIT5.CollectionFramework.HashSet;
//WAP in Java to demonstrate storing and displaying Employee objects using a HashSet.

import java.util.HashSet;

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

public class HashSetExample3 {

    public static void main(String[] args) {

        //Creating a HashSet of Employee objects
        HashSet<Employee> e = new HashSet<>();

        //Adding Employee objects to the HashSet
        e.add(new Employee(1, "Saadvi", 50000));
        e.add(new Employee(2, "Suresh", 60000));
        e.add(new Employee(3, "Kalpana", 55000));

        //Displaying all Employee objects
        System.out.println(e);

    }
}