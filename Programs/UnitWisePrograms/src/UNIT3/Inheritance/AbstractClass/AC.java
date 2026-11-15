package UNIT3.Inheritance.AbstractClass;
//WAP in Java to demonstrate the use of abstract class and abstract methods.
//Defining an abstract class
abstract class MyClass {

    //Declaring an abstract method
    abstract void calculate(double x);
}

//Defining class Stu1 by extending MyClass
class Stu1 extends MyClass {

    //Implementing the calculate() method to find the square
    void calculate(double x) {
        System.out.println("Square  :" + (x * x));
    }
}

//Defining class Stu2 by extending MyClass
class Stu2 extends MyClass {

    //Implementing the calculate() method to find the square root
    void calculate(double x) {
        System.out.println("Square Root :" + Math.sqrt(x));
    }
}

//Defining class Stu3 by extending MyClass
class Stu3 extends MyClass {

    //Implementing the calculate() method to find the cube
    void calculate(double x) {
        System.out.println("Cube :" + (x * x * x));
    }
}

//Defining the main class
public class AC {

    public static void main(String arg[]) {

        //Declaring a reference variable of abstract class MyClass
        MyClass mc;

        //Creating objects of subclasses
        Stu1 obj1 = new Stu1();
        Stu2 obj2 = new Stu2();
        Stu3 obj3 = new Stu3();

        //Assigning the Stu1 object to the superclass reference
        mc = obj1;

        //Calling the calculate() method using superclass reference
        mc.calculate(20);

        //Calling the calculate() method of Stu2
        obj2.calculate(20);

        //Calling the calculate() method of Stu3
        obj3.calculate(20);

    }
}