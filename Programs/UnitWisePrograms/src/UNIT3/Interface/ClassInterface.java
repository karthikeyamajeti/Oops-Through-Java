package UNIT3.Interface;
//WAP in Java to demonstrate multiple inheritance using interfaces.
interface Teacher{
    //Declaring the method
    void display1();
}

interface Student{
    //Declaring the method
    void display2();
}

//Extending multiple interfaces
interface T_S extends Teacher, Student{
    //Declaring an additional method
    void display3();
}

class College implements T_S{
    //Implementing the Teacher interface method
    public void display1(){
        System.out.println("Hi I am Teacher");
    }

    //Implementing the Student interface method
    public void display2()  {
        System.out.println("Hi I am Student");
    }

    //Implementing the T_S interface method
    public void display3()   {
        System.out.println("Hi I am Teacher_Student");
    }
}

public class ClassInterface{
    
    public static void main(String arh[]){
        //Creating an object of College class
        College c = new College();

        //Calling all three methods
        c.display1();
        c.display2();
        c.display3();
    }
}