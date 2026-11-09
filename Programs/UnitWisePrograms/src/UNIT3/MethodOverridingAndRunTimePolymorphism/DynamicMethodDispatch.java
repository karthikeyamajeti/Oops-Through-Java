package UNIT3.MethodOverridingAndRunTimePolymorphism;
//WAP to demonstrate Dynamic Method Dispatch using run-time polymorphism.
class A{

    //Method of class A.
    void callMe(){

        System.out.println("Inside A");
    }
}

class B extends A{

    //Overriding the callMe() method.
    @Override
    void callMe(){

        System.out.println("Inside B");
    }
}

class C extends B{

    //Overriding the callMe() method.
    @Override
    void callMe(){

        System.out.println("Inside C");
    }
}

class DynamicMethodDispatch{

    public static void main(String arg[]){

        //Creating objects of A, B and C classes.
        A a=new A();
        B b=new B();
        C c=new C();

        //Creating a reference variable of class A.
        A ref;

        //Assigning object of class A to reference variable.
        ref=a;

        //Calling the callMe() method of class A.
        ref.callMe();

        //Assigning object of class B to reference variable.
        ref=b;

        //Calling the overridden callMe() method of class B.
        ref.callMe();

        //Assigning object of class C to reference variable.
        ref=c;

        //Calling the overridden callMe() method of class C.
        ref.callMe();
    }
    }