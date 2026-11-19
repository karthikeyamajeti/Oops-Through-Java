package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads by extending the Thread class and executing different statements based on thread names.

class MyClass11 extends Thread {

    //Creating a constructor to initialize the thread name and start the thread
    MyClass11(String n) {

        //Setting the thread name
        setName(n);

        //Starting the thread
        start();

    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously executing the thread
        for (;;) {

            //Getting the current thread name
            String name = Thread.currentThread().getName();

            try {

                //Checking whether the current thread name is Two
                if (name.equals("Two")) {

                    //Printing Siddhartha
                    System.out.println("Siddhartha");

                    //Pausing the thread for 3 seconds
                    Thread.sleep(3000);

                }
                else {

                    //Printing PVP
                    System.out.println("PVP");

                    //Pausing the thread for 3 seconds
                    Thread.sleep(3000);

                }

            }
            catch (InterruptedException e) {

                //Handling the interrupted exception
                System.out.println(e);

            }

        }
    }
}

public class ThreadNameBasedExecution{

    public static void main(String arg[]) {

        //Creating the first thread with the name One
        new MyClass11("One");

        //Creating the second thread with the name Two
        new MyClass11("Two");

    }
}