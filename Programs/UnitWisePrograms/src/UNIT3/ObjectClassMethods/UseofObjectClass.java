package UNIT3.ObjectClassMethods;
//WAP to demonstrate the methods of Object class.
class Dog{
    
}

public class UseofObjectClass {
    
    public static void main(String args[]) {
        
        //Creating an object of Dog class.
        Dog dog = new Dog();

        //Displaying the class name of the object.
        System.out.println("Class Name: " + dog.getClass());

        //Displaying the hash code of the object.
        System.out.println("Hash Code: " + dog.hashCode());

        //Displaying the string representation of the object.
        System.out.println("String Representation: " + dog.toString());
    }
}