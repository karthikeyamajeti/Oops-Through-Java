package UNIT3.Inheritance.TypesofInheritance;
//WAP in Java to demonstrate hierarchical inheritance.
class Animal3 {

    //Defining a method to display eating behaviour
    void eat() {
        System.out.println("Animal is eating");
    }
}

//Inheriting the Animal3 class using extends keyword
class Dog3 extends Animal3 {

    //Defining a method to display barking behaviour
    void bark() {
        System.out.println("Dog is barking");
    }
}

//Inheriting the Animal3 class using extends keyword
class Cat3 extends Animal3 {

    //Defining a method to display meowing behaviour
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {

        //Creating an object of Dog3 class
        Dog3 d = new Dog3();

        //Calling the inherited method of Animal3 class
        d.eat();

        //Calling the method of Dog3 class
        d.bark();


        //Creating an object of Cat3 class
        Cat3 c = new Cat3();

        //Calling the inherited method of Animal3 class
        c.eat();

        //Calling the method of Cat3 class
        c.meow();

    }
}