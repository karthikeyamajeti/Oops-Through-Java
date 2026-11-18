package UNIT3.Inheritance;
//WAP in Java to demonstrate the use of getClass(), hashCode() and toString() methods of the Object class.

class Dog {

}

public class UseofObjectClass {

    public static void main(String[] args) {

        //Creating an instance of Dog
        Dog dog = new Dog();

        //Displaying the runtime class information
        System.out.println("Class Name: " + dog.getClass());

        //Displaying the hash code of the object
        System.out.println("Hash Code: " + dog.hashCode());

        //Displaying the string representation of the object
        System.out.println("String Representation: " + dog.toString());

    }
}