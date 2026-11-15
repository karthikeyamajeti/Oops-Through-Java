package UNIT3.Inheritance.Polymorphism;
//WAP in Java to demonstrate method overriding using multilevel inheritance.
class A1 {
    //Defining the method in the parent class
    void callMe() {
        System.out.println("Inside A");
    }
}

class B1 extends A1 {
    //Overriding the parent class method
    @java.lang.Override
    void callMe(){
        System.out.println("Inside B");
    }
}

class C1 extends B1 {
    //Overriding the method of the immediate parent class
    @java.lang.Override
    void callMe(){
        System.out.println("Inside C");
    }
}

public class MethodOverriding {
    
    public static void main(String args[]){
        
        //Creating objects of all three classes
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();

        //Calling the callMe() method using each object
        a.callMe();
        b.callMe();
        c.callMe();
    }
}