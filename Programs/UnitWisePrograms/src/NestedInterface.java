//WAP to demonstrate Nested Interfaces.

interface Test{
    //Nested interface Yes.
    interface Yes{
        void show();
    }

    //Nested interface No.
    interface No{
        void show();
    }
}

class Testing implements Test.Yes{
    //Implementing the show() method of nested interface Yes.
    public void show(){
        System.out.println("show method of interface - Yes");
    }
}

public class NestedInterface{
    
    public static void main(String args[]){
        
        //Creating an object of Testing class.
        Testing t = new Testing();

        //Calling the implemented show() method.
        t.show();
    }
}