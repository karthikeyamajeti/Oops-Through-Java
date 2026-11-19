package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing a thread by extending the Thread class and starting the thread through a constructor.

class MyClass25 extends Thread {

    //Creating a constructor to start the thread
    MyClass25() {
        //Starting the thread
        start();
    }

    //Overriding the run() method to define thread execution
    public void run() {
        
        //Printing numbers from 0 to 199
        for(int i=0; i<200; i++) {

            try {

                //Displaying the current number
                System.out.println(i);

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

public class ThreadStartInConstructor{

    public static void main(String arg[]) {

        //Creating an object and starting the thread through the constructor
        new MyClass3();

    }
}