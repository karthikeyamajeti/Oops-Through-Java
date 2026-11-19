package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate thread creation by implementing the Runnable interface and printing numbers from 0 to 199.

class MyClass5 implements Runnable {

    //Implementing the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 199
        for(int i=0; i<200; i++){

            //Displaying the current number
            System.out.println(i);

            //Thread.sleep(1000);

        }
    }
}

public class ThreadClassImplementingRunnableInterface{

    public static void main(String arg[]) {

        //Creating an object of MyClass5
        MyClass5 mc = new MyClass5();

        //Creating a Thread object by passing the Runnable object
        Thread t = new Thread(mc);

        //Starting the child thread
        t.start();

    }
}