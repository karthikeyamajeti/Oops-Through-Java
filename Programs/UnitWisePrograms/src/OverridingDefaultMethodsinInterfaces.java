//WAP to demonstrate Overriding Default Methods in Interfaces.

interface Interface10 {
    
    //Abstract method of Interface10.
    void interface1();

    //Default method of Interface10.
    default void show(int x){
        System.out.println("Default Method of Interface10 " + x);
    }
    
}

interface Interface20 extends Interface10 { 
    
    //Abstract method of Interface20.
    void interface2();

    //Overriding the default show() method of Interface10.
    default void show(int x) {
        
        //Calling the default show() method of parent interface.
        Interface10.super.show(10);

        System.out.println("Default Method of Interface20 " + x);
    }
}

class TestClass10 implements Interface10, Interface20{
    
    //Implementing the interface1() method.
    public void interface1(){
        System.out.println("Interface10 method implemented in TC");
    }

    //Implementing the interface2() method.
    public void interface2(){
        System.out.println("Interface20 method implemented in TC");
    }
}

public class OverridingDefaultMethodsinInterfaces {
    
    public static void main(String args[])    {
        
        //Creating an object of TestClass10.
        TestClass10 d = new TestClass10();

        //Calling the implemented interface methods.
        d.interface1();
        d.interface2();

        //Calling the overridden default method.
        d.show(10);
        d.show(10);
    }
}