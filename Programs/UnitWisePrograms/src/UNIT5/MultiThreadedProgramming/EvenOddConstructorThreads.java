package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads by starting threads inside their constructors to print even and odd numbers.

class MyClass12 extends Thread {

    //Creating a constructor to start the even number thread
    MyClass12() {
        start();
    }

    //Overriding the run() method to define even number thread execution
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

class MyClass22 extends Thread {

    //Creating a constructor to start the odd number thread
    MyClass22() {
        start();
    }

    //Overriding the run() method to define odd number thread execution
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

public class EvenOddConstructorThreads{

    public static void main(String ar[]) {

        //Creating objects and automatically starting their threads
        new MyClass12();
        new MyClass22();

    }
}