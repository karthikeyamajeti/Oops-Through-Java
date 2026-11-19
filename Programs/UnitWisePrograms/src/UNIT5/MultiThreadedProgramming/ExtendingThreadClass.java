package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing a thread by extending the Thread class.

class MyClass9 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Printing the message
            System.out.println("hi PVPSIT");

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

public class ExtendingThreadClass{

    public static void main(String arg[]) {

        //Creating an object of MyClass10
        MyClass9 mc = new MyClass9();

        //Starting the thread
        mc.start();

    }
}