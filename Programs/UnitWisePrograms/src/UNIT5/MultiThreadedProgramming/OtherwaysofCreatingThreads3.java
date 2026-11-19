package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate different ways of creating threads using method reference, lambda expression, and anonymous inner class.

public class OtherwaysofCreatingThreads3{

    //Defining method1() for method reference thread
    static void method1() {

        //Displaying the method reference thread message
        System.out.println("It method reference thread.");

    }

    //Defining method2() for lambda expression thread
    static void method2() {

        //Displaying the lambda expression thread message
        System.out.println("It is Lambda expression method thread.");

    }

    //Defining method3() for anonymous inner class thread
    static void method3() {

        //Displaying the anonymous inner class thread message
        System.out.println("It is anonymous inner class thread.");

    }

    public static void main(String[] args) {

        //Creating a thread using method reference
        new Thread(OtherwaysofCreatingThreads3::method1).start();

        //Creating a thread using lambda expression
        new Thread(() -> method2()).start();

        //Creating a thread using anonymous inner class
        new Thread(new Runnable() {

            //Implementing the run() method
            public void run() {

                //Calling method3()
                method3();

            }
        }).start();

    }
}