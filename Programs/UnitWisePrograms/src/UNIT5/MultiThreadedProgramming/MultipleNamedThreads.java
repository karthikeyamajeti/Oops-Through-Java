package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating multiple threads by extending the Thread class and passing thread names through constructors.

class MyClass4 extends Thread {

    //Creating a constructor to initialize the thread name and start the thread
    MyClass4(String n) {

        //Setting the thread name
        setName(n);

        //Starting the thread
        start();

    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 19
        for (int i = 0; i < 20; i++) {

            try {

                //Displaying the current thread name and number
                System.out.println(Thread.currentThread().getName() + ":" + i);

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

public class MultipleNamedThreads {

    public static void main(String arg[]) {

        //Creating and starting three threads with different names
        new MyClass4("One");
        new MyClass4("Two");
        new MyClass4("Three");

    }
}