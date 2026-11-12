//WAP to demonstrate the use of @Override annotation with toString() method.
class Student10 {
    
    //Overriding the toString() method of Object class.
    @Override
    public String toString(){
        return "PVPSIT";
    }
    
}

public class UseofToString_Annotation {
    
    public static void main(String args[]){
        
        //Creating an object of Student class.
        Student10 s1 = new Student10();

        //Displaying the object using println().
        //Java automatically calls the toString() method.
        System.out.println(s1);
    }
}