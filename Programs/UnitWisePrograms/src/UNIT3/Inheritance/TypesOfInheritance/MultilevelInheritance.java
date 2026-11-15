package UNIT3.Inheritance.TypesofInheritance;
//WAP in Java to demonstrate multilevel inheritance.
class Animal2 {

    //Defining a method to display eating behaviour
    void eat() {
        System.out.println("Animal is eating");
    }
}

//Inheriting the Animal2 class using extends keyword
class Dog2 extends Animal2 {

    //Defining a method to display barking behaviour
    void bark() {
        System.out.println("Dog is barking");
    }
}

//Inheriting the Dog2 class using extends keyword
class Puppy2 extends Dog2 {

    //Defining a method to display playing behaviour
    void play() {
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritance{

    public static void main(String[] args) {

        //Creating an object of Puppy2 class
        Puppy2 p = new Puppy2();

        //Calling the inherited method of Animal2 class
        p.eat();

        //Calling the inherited method of Dog2 class
        p.bark();

        //Calling the method of Puppy2 class
        p.play();

    }
}