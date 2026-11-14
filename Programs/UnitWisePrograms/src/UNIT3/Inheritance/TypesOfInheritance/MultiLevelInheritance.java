class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Puppy2 extends Dog2 {
    void play() {
        System.out.println("Puppy is playing");
    }
}
public class ML {
    public static void main(String[] args) {
        Puppy2 p = new Puppy2();
        p.eat();
        p.bark();
        p.play();
    }
}