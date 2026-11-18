package UNIT3.Interface;
//WAP in Java to demonstrate nested interfaces in Java.

interface Test {
    
    //Declaring a nested interface Yes
    interface Yes {
        void show();
    }

    //Declaring a nested interface No
    interface No {
        void show();
    }
}

class Testing implements Test {
    
    //Implementing the outer interface Test
    //No methods need to be implemented because Test has no abstract methods
}

public class NestedInterface {
    
    public static void main(String[] args) {
        
        //Creating an object of Testing class
        Testing t = new Testing();

        //Calling the show() method is not possible directly
        //t.show();
    }
}