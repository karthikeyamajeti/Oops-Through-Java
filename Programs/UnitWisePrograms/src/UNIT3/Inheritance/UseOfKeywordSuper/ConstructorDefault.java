package UNIT3.Inheritance.UseofKeywordSuper;
//WAP in Java to demonstrate the calling of a default constructor in inheritance.
//Defining the superclass Base
class Base {

    //Defining the constructor of class Base
    Base() {
        System.out.println("Hi");
    }
}

//Defining class Derived by extending class Base
class Derived extends Base {

    //No constructor is explicitly defined in Derived class
    //Java automatically provides a default constructor
    //The default constructor implicitly calls super()
}
public class ConstructorDefault {

    public static void main(String[] args) {

        //Creating an object of class Derived
        Derived d = new Derived();

    }
}