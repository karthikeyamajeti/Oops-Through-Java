package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads by printing even and odd numbers simultaneously.

class MyClass10 extends Thread {

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
                    System.out.println(Thread.currentThread().getName() + i);
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

class MyClass20 extends Thread {

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
                    System.out.println(Thread.currentThread().getName() + i);
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

public class MultipleThreadExample1{

    public static void main(String ar[]) {

        //Creating two thread objects
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();

        //Assigning names to the threads
        mc1.setName("Even: ");
        mc2.setName("Odd: ");

        //Starting both threads
        mc1.start();
        mc2.start();

    }
}