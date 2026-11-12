//WAP to demonstrate Default Methods in Interfaces.

interface Interface1{
    //Abstract method of Interface1.
    void interface1();

    //Default method of Interface1.
    default void show(int x){
        System.out.println("Default Method of Interface 1 " + x);
    }
    
}

interface Interface2{
    //Abstract method of Interface2.
    void interface2();

    //Default method of Interface2.
    default void show(double x) {
        System.out.println("Default Method of Interface 2 " + x);
    }
}

class TestClass implements Interface1, Interface2{
    //Implementing the interface1() method.
    public void interface1() {
        System.out.println("Interface 1 method implemented in TC");
    }

    //Implementing the interface2() method.
    public void interface2(){
        System.out.println("Interface 2 method implemented in TC");
    }
}

public class DefaultMethodsInInterfaces{
    
    public static void main(String args[]){
        
        //Creating an object of TestClass.
        TestClass d = new TestClass();

        //Calling the implemented interface methods.
        d.interface1();
        d.interface2();

        //Calling the overloaded default method of Interface1.
        d.show(10);
    }
}