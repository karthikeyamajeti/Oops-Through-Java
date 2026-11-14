class Animal3 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HL {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();
        d.bark();

        Cat3 c = new Cat3();
        c.eat();
        c.meow();
    }
}