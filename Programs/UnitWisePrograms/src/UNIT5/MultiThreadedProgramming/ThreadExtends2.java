package UNIT5.Thread;
//WAP in Java to demonstrate multiple thread execution by printing even numbers using a child thread and odd numbers using the main thread.

class MyClass1 extends Thread {

    //Overriding the run() method to define child thread execution
    public void run() {

        //Printing even numbers from 1 to 199
        for (int i = 1; i < 200; i++) {

            try {

                //Checking and printing even numbers
                if (i % 2 == 0) {
                    System.out.println("Child: " + i);
                }

                //Pausing the child thread for 1 second
                sleep(1000);

            }
            catch (Exception e) {
                //Handling exceptions
            }

        }
    }
}

public class ThreadExtends2 {

    public static void main(String arg[]) {

        //Creating an object of MyClass1
        MyClass1 mc = new MyClass1();

        //Starting the child thread
        mc.start();

        //Printing odd numbers from 1 to 199 using the main thread
        for (int i = 1; i < 200; i++) {

            try {

                //Checking and printing odd numbers
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }

                //Pausing the main thread for 1 second
                Thread.sleep(1000);

            }
            catch (Exception e) {
                //Handling exceptions
            }

        }

    }
}