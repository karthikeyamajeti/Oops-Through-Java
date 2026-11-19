package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating Thread objects using default and parameterized constructors.

public class ThreadConstructorExample{

    public static void main(String arg[]) {

        //Creating a Thread object using the default constructor
        Thread t1 = new Thread();

        //Creating a Thread object using the parameterized constructor
        Thread t2 = new Thread("PVPSIT");

        //Displaying the current thread details
        System.out.println("Current Thread:" + Thread.currentThread());

        //Displaying the first child thread details
        System.out.println("Child Thread t1:" + t1);

        //Displaying the second child thread details
        System.out.println("Child Thread t2:" + t2);

    }
}