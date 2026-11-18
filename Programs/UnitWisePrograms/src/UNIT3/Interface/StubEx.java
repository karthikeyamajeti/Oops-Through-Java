package UNIT3.Interface;
//WAP in Java to demonstrate stub methods in interfaces.

interface Test2 {
    
    //Declaring the abstract methods
    void show();
    void show1();
}

class Testing2 implements Test2 {
    
    //Implementing the show() method
    public void show() {
        System.out.println("show method of interface");
    }

    //Providing an empty implementation of show1()
    public void show1() {
    }
}

public class StubEx {
    
    public static void main(String[] args) {
        
        //Creating an object of Testing2 class
        Testing2 t = new Testing2();

        //Calling the show() method
        t.show();
    }
}