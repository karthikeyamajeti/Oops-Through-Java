package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate thread creation by extending the Thread class and continuously printing a message.

class MyClass0 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Printing the message
            System.out.println("Hi PVPSIT");

        }
    }
}

public class BasicThreadExample{

    public static void main(String arg[]) {

        //Creating an object of MyClass0
        MyClass0 mc = new MyClass0();

        //Starting the child thread
        mc.start();

    }
}