package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate thread creation by extending the Thread class and printing numbers from 0 to 199.

class MyClass6 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 199
        for (int i = 0; i < 200; i++) {

            //Displaying the current number
            System.out.println(i);

            try {
                //Pausing the thread for 2 seconds
                sleep(2000);
            }
            catch (Exception e) {
                //Handling exceptions
            }

        }
    }
}

public class NumberPrintingThread{

    public static void main(String arg[]) {

        //Creating an object of MyClass
        MyClass6 mc = new MyClass6();

        //Starting the child thread
        mc.start();

    }
}