package UNIT0;
import java.util.*;

// Parent class
class Parents {

    // Method to calculate addition
    void add(int num1,int num2) {
        int sum = num1+num2;
        System.out.println("Addition: "+sum);
    }
}

// Child class inherits Parents
class Child extends Parents {

    // Method to calculate subtraction
    void sub(int num1,int num2) {

        // Calling parent class add() method using super
        super.add(num1,num2);

        int diff = num1-num2;
        System.out.println("Subtraction: " + diff);
    }
}

public class UseofSuperkeyword{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Creating child class object
        Child c = new Child();

        // Calling sub() method
        c.sub(num1, num2);
    }
}