package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating a thread by implementing the Runnable interface and assigning a name to the thread.

class MyRunnable1 implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread information
        System.out.println(Thread.currentThread());
    }

    //Overriding the toString() method
    public String toString() {
        return "Hello PVPSIT";
    }
}

public class ThreadNameRunnable {

    public static void main(String args[]) {

        //Displaying the main thread information
        System.out.println(Thread.currentThread());

        //Creating an object of MyRunnable
        MyRunnable mr = new MyRunnable();

        //Creating a thread with the name BEC
        Thread t = new Thread(mr, "BEC");

        //Starting the thread
        t.start();

    }
}