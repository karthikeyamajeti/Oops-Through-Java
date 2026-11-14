class Animal300
{
    void eat()
    {
        System.out.println("Animal eats");
    }
    void sleep()
    {
        System.out.println("Animal sleeps");
    }
}
class Dog300 extends Animal300
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
public class SC_Reference {
    public static void main(String args[])
    {
        // Creating Dog object
        Dog300 d = new Dog300();
        // Normal Dog reference
        d.eat();
        d.sleep();
        d.bark();
        System.out.println("----------------");
        // Upcasting
        Animal300 a = d;
        a.eat();
        a.sleep();
        // a.bark();   // Error: bark() is not available in Animal
        
        System.out.println("-------------------");
   }
}
/*

// DOWNCASTING
Dog300 d1 = (Dog300) a;

System.out.println("After Downcasting:");

d1.eat();
d1.sleep();
d1.bark();
*/