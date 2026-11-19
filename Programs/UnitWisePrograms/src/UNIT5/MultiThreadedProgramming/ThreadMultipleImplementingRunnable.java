package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads using the Runnable interface to print even and odd numbers simultaneously.

class MyClass19 implements Runnable {

    //Implementing the run() method to define even number thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Initializing the counter
            int i = 1;

            //Checking numbers from 1 to 99
            while (i < 100) {

                //Checking and printing even numbers
                if (i % 2 == 0) {
                    System.out.println("Even " + i);
                }

                //Incrementing the counter
                i++;

                try {
                    //Pausing the thread for 1 second
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                    //Handling exceptions
                }
            }
        }
    }
}

class MyClass21 implements Runnable {

    //Implementing the run() method to define odd number thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Initializing the counter
            int i = 1;

            //Checking numbers from 1 to 99
            while (i < 100) {

                //Checking and printing odd numbers
                if (i % 2 != 0) {
                    System.out.println("Odd " + i);
                }

                //Incrementing the counter
                i++;

                try {
                    //Pausing the thread for 1 second
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                    //Handling exceptions
                }
            }
        }
    }
}

public class ThreadMultipleImplementingRunnable {

    public static void main(String ar[]) {

        //Creating two Thread objects using Runnable implementations
        Thread t1 = new Thread(new MyClass1());
        Thread t2 = new Thread(new MyClass2());

        //Starting both threads
        t1.start();
        t2.start();

    }
}