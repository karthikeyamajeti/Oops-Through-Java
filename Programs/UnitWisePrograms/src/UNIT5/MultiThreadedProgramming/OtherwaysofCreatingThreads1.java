package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate different ways of creating threads using method reference, lambda expression, and anonymous inner class.

public class OtherwaysofCreatingThreads1{

    public static void main(String[] args) {

        //Creating a thread using method reference
        new Thread(OtherwaysofCreatingThreads1::method1).start();

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

    //Defining method1() for method reference thread
    static void method1() {
        System.out.println("It is method reference thread.");
    }

    //Defining method2() for lambda expression thread
    static void method2() {
        System.out.println("It is Lambda expression method thread.");
    }

    //Defining method3() for anonymous inner class thread
    static void method3() {
        System.out.println("It is anonymous inner class thread.");
    }

}