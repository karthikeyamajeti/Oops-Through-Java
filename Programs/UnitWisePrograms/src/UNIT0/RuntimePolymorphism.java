package UNIT0;

/*
WAP to demonstrate runtime polymorphism using inheritance and method overriding.
Create Animal, Dog and Cat classes and override makeSound().
Display the sound based on the user's input.
Print "invalid animal" for any other input.
*/

import java.util.*;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inherits Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class inherits Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read animal type
        String type = sc.nextLine();

        // Parent class reference
        Animal a;

        // Create Dog object and call overridden method
        if (type.equals("Dog")) {
            a = new Dog();
            a.makeSound();
        }
        // Create Cat object and call overridden method
        else if (type.equals("Cat")) {
            a = new Cat();
            a.makeSound();
        }
        // Handle invalid animal input
        else {
            System.out.println("invalid animal");
        }
    }
}