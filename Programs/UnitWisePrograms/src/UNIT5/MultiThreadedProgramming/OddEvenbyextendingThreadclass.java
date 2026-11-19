package UNIT5.Thread;
//WAP in Java to demonstrate multiple threads by extending the Thread class to print even and odd numbers simultaneously.

class Printing extends Thread {

    //Creating a constructor to initialize the thread name and start the thread
    Printing(String n) {

        //Setting the thread name
        setName(n);

        //Starting the thread
        start();

    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Checking numbers from 1 to 200
        for (int i = 1; i <= 200; i++) {

            //Checking whether the current thread is Even
            if (i % 2 == 0 && Thread.currentThread().getName().equals("Even")) {

                //Displaying even numbers
                System.out.println("Even Number: " + i);

                try {
                    //Pausing the thread for 2 seconds
                    sleep(2000);
                }
                catch (Exception e) {
                    //Handling exceptions
                }
            }

            //Checking whether the current thread is Odd
            if (i % 2 != 0 && Thread.currentThread().getName().equals("Odd")) {

                //Displaying odd numbers
                System.out.println("Odd Number: " + i);

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
}

public class OddEvenbyextendingThreadclass {

    public static void main(String args[]) {

        //Creating the Even thread
        Printing e = new Printing("Even");

        //Creating the Odd thread
        Printing o = new Printing("Odd");

    }
}