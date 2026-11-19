package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and starting a thread inside the constructor by extending the Thread class.

class MyClass16 extends Thread {

    //Creating a constructor to start the thread automatically
    MyClass16() {
        start();
    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 199
        for(int i=0; i<200; i++){

            try{

                //Displaying the current number
                System.out.println(i);

                //Pausing the thread for 1 second
                sleep(1000);
            }
            catch(Exception e){
                //Handling exceptions
            }
        }
    }
}

public class ThreadExtendingExample3 {

    public static void main(String arg[]) {

        //Creating an object and automatically starting the thread
        new MyClass16();

    }
}