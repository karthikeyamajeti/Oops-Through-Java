package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing a thread by implementing the Runnable interface.

class MyRunnable implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread name
        System.out.println("Thread : " + Thread.currentThread().getName());
    }
}

public class ThreadClassByImplementingRunnable {

    public static void main(String[] args) {

        //Creating a Thread object with MyRunnable and assigning a name
        Thread t = new Thread(new MyRunnable(), "PVPSIT");

        //Starting the thread
        t.start();

    }
}