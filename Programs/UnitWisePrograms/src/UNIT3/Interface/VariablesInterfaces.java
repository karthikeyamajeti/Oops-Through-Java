package UNIT3.Interface;
//WAP in Java to demonstrate accessing variables with the same name from multiple interfaces.

interface left {
    
    //Declaring and initializing the variable
    int i = 10;
}

interface right {
    
    //Declaring and initializing the variable with the same name
    int i = 100;
}

public class VariablesInterfaces implements left, right {
    
    public static void main(String args[]) {
        
        //Accessing the variable of left interface
        System.out.println(left.i);

        //Accessing the variable of right interface
        System.out.println(right.i);
    }
}