//WAP to demonstrate Stub Class.

interface Test2{
    
    //Abstract methods of Test2 interface.
    void show();
    void show1();
    
}

class Testing2 implements Test2{
    
    //Implementing the show() method of Test2 interface.
    public void show(){
        System.out.println("show method of interface");
    }

    //Providing an empty implementation of show1() method.
    public void show1(){
        
    }
}

public class StubEx {
    
    public static void main(String args[]) {
        
        //Creating an object of Testing2 class.
        Testing2 t = new Testing2();

        //Calling the implemented show() method.
        t.show();
        
    }
}