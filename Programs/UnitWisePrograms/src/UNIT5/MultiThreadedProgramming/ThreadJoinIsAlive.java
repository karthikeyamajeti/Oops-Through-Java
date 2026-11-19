package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate the use of isAlive() and join() methods in thread execution.

class AIML extends Thread {

    //Overriding the run() method to define child thread execution
    public void run() {

        //Printing numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {

            //Displaying the current thread name and number
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                //Pausing the child thread for 10 seconds
                sleep(10000);
            }
            catch (Exception e) {
                //Handling exceptions
            }

        }
    }
}

public class ThreadJoinIsAlive{

    public static void main(String args[]) throws Exception {

        //Creating an object of AIML
        AIML ai = new AIML();

        //Starting the child thread
        ai.start();

        //Checking whether the child thread is alive before join()
        System.out.println("Prior to join " + ai.isAlive());

        //Making the main thread wait until the child thread finishes
        ai.join();

        //Checking whether the child thread is alive after join()
        System.out.println("After join " + ai.isAlive());

        //Displaying the main thread termination message
        System.out.println(Thread.currentThread().getName() + " Terminated");

    }
}