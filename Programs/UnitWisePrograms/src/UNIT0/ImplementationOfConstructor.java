package UNIT0;
/*
WAP to demonstrate constructors by creating a Person class with name and
age attributes. Initialize them using a parameterized constructor and
display the details using displayDetails().
*/

import java.util.*;

// Creating Person class
class Person {

    // Declaring instance variables
    String name;
    int age;

    // Parameterized constructor to initialize instance variables
    Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    // Method to display person details
    void displaydetails() {
        System.out.println("Student name : "+name);
        System.out.println("Student age : "+age);
    }
}

public class ImplementationOfConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading person's name
        String str = sc.nextLine();

        // Reading person's age
        int age = sc.nextInt();

        // Creating Person object and passing values to constructor
        Person p = new Person(str,age);

        // Calling method to display person details
        p.displaydetails();
        
    }
}