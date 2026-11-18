package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the use of super keyword to call the superclass method.
//Defining the superclass Student
class Student {

    //Defining a method to display a message
    void message() {
        System.out.println("Good Morning Sir");
    }
}

//Defining class Faculty by extending class Student
class Faculty extends Student {

    //Overriding the message() method of class Student
    void message() {
        System.out.println("Good Morning Students");
    }

    //Defining a method to display both messages
    void display() {

        //Calling the current class message() method
        message();

        //Calling the superclass Student message() method
        super.message();
    }
}
public class SuperClassMethod {

    public static void main(String args[]) {

        //Creating an object of class Faculty
        Faculty f = new Faculty();

        //Calling the display() method
        f.display();

    }
}