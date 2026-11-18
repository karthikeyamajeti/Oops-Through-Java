package UNIT3.Interface;
//WAP in Java to demonstrate implementing a nested interface declared inside a class.

class Test1 {
    
    //Declaring a nested interface
    interface Yes {
        void show();
    }
    
}

class Testing1 implements Test1.Yes {
    
    //Implementing the show() method of nested interface
    public void show() {
        System.out.println("show method of interface");
    }
}

public class NestedInterfaceInClass {
    
    public static void main(String[] args) {
        
        //Creating an object of Testing1 class
        Testing1 t = new Testing1();

        //Calling the show() method
        t.show();
    }
}