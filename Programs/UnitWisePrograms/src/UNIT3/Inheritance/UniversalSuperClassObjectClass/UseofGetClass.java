package UNIT3.Inheritance;
//WAP in Java to demonstrate the use of getClass() method to retrieve class information and display declared methods.

import java.lang.reflect.Method;

//Creating a Student class
class Student {

    //Defining a method to display student details
    void display() {
        System.out.println("Student details");
    }

    //Defining a method to display study information
    void study() {
        System.out.println("Student is studying");
    }

    //Defining a method to calculate total marks
    int calculateMarks(int a, int b) {
        return a + b;
    }
}

public class UseofGetClass {

    public static void main(String[] args) {

        //Creating a Student object
        Student s = new Student();

        //Getting the Class object of the concerned object
        Class<?> c = s.getClass();

        //Displaying the runtime class name
        System.out.println("Class Name: " + c.getName());

        System.out.println("\nMethods of Student class:");

        //Getting all declared methods of the Student class
        Method[] methods = c.getDeclaredMethods();

        //Displaying the method names using an enhanced for loop
        for(Method m : methods) {
            System.out.println(m.getName());
        }

    }
}