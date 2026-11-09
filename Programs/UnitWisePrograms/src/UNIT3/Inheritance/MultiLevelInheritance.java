package UNIT3.Inheritance;
//WAP to demonstrate Multilevel Inheritance.
class Animal2{
    //Method of parent class Animal2.
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog2 extends Animal2{
    //Method of child class Dog2.
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy2 extends Dog2{
    //Method of child class Puppy2.
    void play(){
        System.out.println("Puppy is playing");
    }
}

public class MultiLevelInheritance{
    public static void main(String args[]){
        //Creating an object of child class Puppy2.
        Puppy2 p = new Puppy2();

        //Calling the inherited method of Animal2.
        p.eat();

        //Calling the inherited method of Dog2.
        p.bark();

        //Calling the method of Puppy2.
        p.play();
    }
}