package UNIT0;
import java.util.*;
class Person1{
    String name;
    Scanner sc = new Scanner(System.in);

    // Method to accept the person's name
    void inputName(){
        System.out.print("Enter student name:");
        name=sc.nextLine();
    }

    // Method to display the person's name
    void displayName(){
        System.out.print("Name : "+name);
    }
}

// Citizen class inherits the properties and methods of Person1
class Citizen extends Person1{
    int age;
    Scanner sc = new Scanner(System.in);

    // Method to accept the person's age
    void inputAge(){
        System.out.print("Enter age:");
        age=sc.nextInt();
    }

    // Method to display the person's age
    void displayAge(){
        System.out.print("Age : "+age);
    }
}

public class PersongNameAgeSingleInheritance {
    public static void main(String[] args) {

        // Creating an object of the child class
        Citizen c = new Citizen();

        // Calling inherited methods to input and display the name
        c.inputName();
        c.displayName();

        // Calling child class methods to input and display the age
        c.inputAge();
        c.displayAge();
    }
}