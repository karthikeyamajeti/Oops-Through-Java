package UNIT3.Inheritance;
//WAP to demonstrate Upcasting and Downcasting using Inheritance.
class Animal300{
    //Method of parent class Animal300.
    void eat(){
        System.out.println("Animal eats");
    }

    //Another method of parent class Animal300.
    void sleep(){
        System.out.println("Animal sleeps");
    }
}

class Dog300 extends Animal300{
    //Method of child class Dog300.
    void bark(){
        System.out.println("Dog barks");
    }
}

public class UpcastingandDowncasting {
    
    public static void main(String args[]){
        //Creating an object of child class Dog300.
        Dog300 d = new Dog300();

        //Accessing methods using Dog300 reference.
        d.eat();
        d.sleep();
        d.bark();

        System.out.println("----------------");

        //Performing upcasting.
        Animal300 a = d;

        //Accessing parent class methods using Animal300 reference.
        a.eat();
        a.sleep();

        //a.bark(); //Error: bark() is not available in Animal300 reference.

        System.out.println("-------------------");

        //Performing downcasting.
        Dog300 d1 = (Dog300) a;

        //Accessing methods after downcasting.
        System.out.println("After Downcasting:");

        d1.eat();
        d1.sleep();
        d1.bark();
    }
}