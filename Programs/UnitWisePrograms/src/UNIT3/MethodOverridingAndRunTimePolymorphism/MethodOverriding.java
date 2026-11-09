package UNIT3.MethodOverridingAndRunTimePolymorphism;
//WAP to demonstrate Method Overriding.
class A1{
    //Method of class A1.
    void callMe(){
        System.out.println("Inside A");
    }
}

class B1 extends A1{
    //Overriding the callMe() method of class A1.
    @Override
    void callMe(){
        System.out.println("Inside B");
    }
}

class C1 extends B1{
    //Overriding the callMe() method of class B1.
    @Override
    void callMe(){
        System.out.println("Inside C");
    }
}

public class MethodOverriding {
    
    public static void main(String args[]){
        //Creating objects of A1, B1 and C1 classes.
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();

        //Calling the callMe() method using each object.
        a.callMe();
        b.callMe();
        c.callMe();
        
    }
}