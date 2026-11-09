package UNIT3.Inheritance;
//WAP to demonstrate Single Inheritance.

class Animal1{
    //Method of parent class Animal1.
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1{
    //Method of child class Dog1.
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance{

    public static void main(String args[]){
        //Creating an object of child class Dog1.
        Dog1 d = new Dog1();

        //Calling the inherited method of parent class.
        d.eat();

        //Calling the method of child class.
        d.bark();
    }
}