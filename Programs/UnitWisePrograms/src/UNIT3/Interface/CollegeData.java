package UNIT3.Interface;
//WAP in Java to demonstrate multiple inheritance by implementing two interfaces.
interface Teacher1{
    //Declaring the method
    void display1();
}

interface Student1{
    //Declaring the method
    void display2();
}

class College1 implements Teacher1, Student1{
    //Implementing the Teacher1 interface method
    public void display1(){
        System.out.println("Hi I am Teacher");
    }

    //Implementing the Student1 interface method
    public void display2(){
        System.out.println("Hi I am Student");
    }
}

public class CollegeData{
    
    public static void main(String arh[]) {
        //Creating an object of College1 class
        College1 c = new College1();

        //Calling both interface methods
        c.display1();
        c.display2();
    }
}