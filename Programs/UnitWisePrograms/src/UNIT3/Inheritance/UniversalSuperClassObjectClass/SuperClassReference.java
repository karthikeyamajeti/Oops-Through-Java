package UNIT3.Inheritance;
//WAP in Java to demonstrate upcasting and downcasting using superclass reference.

class Animal300 {

    //Defining a method to display eating behavior
    void eat() {
        System.out.println("Animal eats");
    }

    //Defining a method to display sleeping behavior
    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog300 extends Animal300 {

    //Defining a method to display barking behavior
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SuperClassReference {

    public static void main(String args[]) {

        //Creating a Dog object
        Dog300 d = new Dog300();

        //Accessing methods using Dog reference
        d.eat();
        d.sleep();
        d.bark();

        System.out.println("----------------");

        //Performing upcasting
        Animal300 a = d;

        //Accessing superclass methods using Animal reference
        a.eat();
        a.sleep();

        //a.bark(); //Error: bark() is not available in Animal300

        System.out.println("-------------------");

        //Performing downcasting
        Dog300 d1 = (Dog300) a;

        System.out.println("After Downcasting:");

        //Accessing superclass and subclass methods using Dog reference
        d1.eat();
        d1.sleep();
        d1.bark();

    }
}