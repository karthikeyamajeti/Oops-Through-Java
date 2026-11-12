//WAP to demonstrate Multiple Inheritance using Interfaces.

interface Teacher{
    //Abstract method of Teacher interface.
    void display1();
}

interface Student{
    //Abstract method of Student interface.
    void display2();
}

//Interface T_S extends both Teacher and Student interfaces.
interface T_S extends Teacher, Student{
    //Abstract method of T_S interface.
    void display3();
}

class College implements T_S{
    //Implementing the display1() method of Teacher interface.
    public void display1(){
        System.out.println("Hi I am Teacher");
    }

    //Implementing the display2() method of Student interface.
    public void display2(){
        System.out.println("Hi I am Student");
    }

    //Implementing the display3() method of T_S interface.
    public void display3(){
        System.out.println("Hi I am Teacher_Student");
    }
}

public class MultipleInheritanceUsingInterfaces{
    
    public static void main(String args[]){
        
        //Creating an object of College class.
        College c = new College();

        //Calling the implemented interface methods.
        c.display1();
        c.display2();
        c.display3();
        
    }
}