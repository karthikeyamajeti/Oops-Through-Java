package UNIT3.JavaReflectionl;
//WAP to demonstrate the use of getClass() method.

class Student{
    //Method to display student details.
    void display(){
        System.out.println("Student details");
    }

    //Method to display study information.
    void study(){
        System.out.println("Student is studying");
    }

    //Method to calculate total marks.
    int calculateMarks(int a, int b){
        return a+b;
    }
}

public class UseofGetClass{
    
    public static void main(String args[]){
        
        //Creating an object of Student class.
        Student s = new Student();

        //Getting the Class object of the concerned object.
        Class c = s.getClass();

        //Displaying the run-time class name.
        System.out.println("Class Name: " + c.getName());

        System.out.println("\nMethods of Student class:");

        //Getting all declared methods of Student class.
        java.lang.reflect.Method[] methods = c.getDeclaredMethods();

        //Displaying the names of all declared methods.
        for(java.lang.reflect.Method m : methods){
            System.out.println(m.getName());
        }
        
    }
}