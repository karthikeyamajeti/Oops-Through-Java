package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing a thread by implementing the Runnable interface.

class MyClass8 implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Printing the message
            System.out.println("Hi PVPSIT.....");

            try {

                //Pausing the thread for 1 second
                Thread.sleep(1000);

            }
            catch (InterruptedException e) {

                //Handling the interrupted exception
                System.out.println(e);

            }

        }
    }
}

public class ThreadExecutionUsingRunnable {

    public static void main(String args[]) {

        //Creating a Thread object using the MyClass11 Runnable object
        Thread t = new Thread(new MyClass8());

        //Starting the thread
        t.start();

    }
}