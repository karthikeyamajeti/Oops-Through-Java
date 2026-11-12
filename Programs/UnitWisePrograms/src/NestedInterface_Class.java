//WAP to demonstrate Nested Interface inside a Class.

class Test1{
    
    //Declaring a nested interface Yes.
    interface Yes{
        //Abstract method of Yes interface.
        void show();
    }
    
}

class Testing1 implements Test1.Yes {
    
    //Implementing the show() method of nested interface.
    public void show(){
        System.out.println("show method of interface");
    }
    
}

public class NestedInterface_Class {
    
    public static void main(String args[]){
        
        //Creating an object of Testing1 class.
        Testing1 t = new Testing1();

        //Calling the implemented show() method.
        t.show();
    }
}