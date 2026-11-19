package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating a thread by implementing the Runnable interface and printing numbers from 0 to 199.

class MyClass18 implements Runnable {

    //Implementing the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 199
        for (int i = 0; i < 200; i++) {

            //Displaying the current number
            System.out.println(i);

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

public class ThreadImplementingRunnableInterface {

    public static void main(String arg[]) {

        //Creating an object of MyClass
        MyClass18 mc = new MyClass18();

        //Creating a Thread object by passing the Runnable object
        Thread t = new Thread(mc);

        //Starting the child thread
        t.start();

    }
}