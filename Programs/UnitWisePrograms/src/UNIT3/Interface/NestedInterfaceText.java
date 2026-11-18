package UNIT3.Interface;
//WAP in Java to demonstrate a nested interface for finding the maximum of two numbers.

class A {
    
    //Declaring a nested interface
    interface Nested {
        int max(int x, int y);
    }
}

class MAX implements A.Nested {
    
    //Implementing the max() method of nested interface
    public int max(int x, int y) {
        return x > y ? x : y;
    }
}

public class NestedInterfaceText {
    
    public static void main(String arg[]) {
        
        //Creating an object of MAX class
        MAX m = new MAX();

        //Calling the max() method and displaying the result
        System.out.println("Maximum Number:" + m.max(10, 20));
    }
}