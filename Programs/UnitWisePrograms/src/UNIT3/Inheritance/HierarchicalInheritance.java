package UNIT3.Inheritance;
//WAP to demonstrate Hierarchical Inheritance.
class Animal3{
    //Method of parent class Animal3.
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog3 extends Animal3{
    //Method of child class Dog3.
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat3 extends Animal3{
    //Method of child class Cat3.
    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance{
    public static void main(String args[]){
        //Creating an object of child class Dog3.
        Dog3 d = new Dog3();

        //Calling the inherited method of Animal3.
        d.eat();

        //Calling the method of Dog3.
        d.bark();

        //Creating an object of child class Cat3.
        Cat3 c = new Cat3();

        //Calling the inherited method of Animal3.
        c.eat();

        //Calling the method of Cat3.
        c.meow();
    }
}