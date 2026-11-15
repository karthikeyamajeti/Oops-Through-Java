package UNIT3.Inheritance.TypesOfInheritance;
//WAP in Java to demonstrate single inheritance.
class Animal1 {

    //Defining a method to display eating behaviour
    void eat() {
        System.out.println("Animal is eating");
    }
}

//Inheriting the Animal1 class using extends keyword
class Dog1 extends Animal1 {

    //Defining a method to display barking behaviour
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        //Creating an object of Dog1 class
        Dog1 d = new Dog1();

        //Calling the inherited method of Animal1 class
        d.eat();

        //Calling the method of Dog1 class
        d.bark();

    }
}