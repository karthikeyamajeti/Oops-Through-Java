package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate different ways of creating threads using method reference, lambda expression, and anonymous inner class.

class Demo {

    //Defining a static display() method
    public static void display() {

        //Displaying the thread execution message
        System.out.println("Thread is executing");

    }
}

public class OtherwaysofCreatingThreads2 {

    public static void main(String[] args) {

        //Creating a thread using method reference
        Thread t = new Thread(Demo::display);

        //Creating a thread using lambda expression
        Thread t1 = new Thread(() -> System.out.println("Hello PVPSIT"));

        //Creating a thread using anonymous inner class
        Thread t2 = new Thread(new Runnable() {

            //Implementing the run() method
            public void run() {

                //Displaying the anonymous inner class message
                System.out.println("Hello Anonymous inner class");

            }
        });

        //Starting the first thread
        t.start();

        //Starting the second thread
        t1.start();

        //Starting the third thread
        t2.start();

    }
}