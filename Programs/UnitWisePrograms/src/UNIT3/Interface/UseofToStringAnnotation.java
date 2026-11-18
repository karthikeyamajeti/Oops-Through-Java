package UNIT3.Interface;
//WAP in Java to demonstrate overriding the toString() method.

class StudentDetails {
    
    //Overriding the toString() method
    @java.lang.Override
    public String toString() {
        return "PVPSIT";
    }
}

public class UseofToStringAnnotation {
    
    public static void main(String args[]) {
        
        //Creating an object of StudentDetails class
        StudentDetails s1 = new StudentDetails();

        //Displaying the object using the toString() method
        System.out.println(s1);
    }
}