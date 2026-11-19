package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating a thread by extending the Thread class and printing numbers from 0 to 199.

class MyClass14 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 199
        for (int i = 0; i < 200; i++) {

            //Displaying the current number
            System.out.println(i);

            try {
                //Pausing the thread for 5 seconds
                sleep(5000);
            }
            catch (Exception e) {
                //Handling exceptions
            }
        }
    }
}

public class ThreadExtendingExample1 {

    public static void main(String arg[]) {

        //Creating an object of MyClass
        MyClass14 mc = new MyClass14();

        //Starting the child thread
        mc.start();

    }
}