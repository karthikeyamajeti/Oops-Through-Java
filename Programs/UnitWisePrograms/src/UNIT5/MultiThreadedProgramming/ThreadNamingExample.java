package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate assigning and retrieving thread names using the Thread class.

public class ThreadNamingExample{

    public static void main(String args[]) {

        //Creating a thread with the default name
        Thread t1 = new Thread();

        //Creating a thread with the name PVPSIT
        Thread t2 = new Thread("PVPSIT");

        //Displaying the current thread information
        System.out.println(Thread.currentThread());

        //Displaying the first thread information
        System.out.println(t1);

        //Displaying the second thread information
        System.out.println(t2);

        //Setting the name of the first thread to BEC
        t1.setName("BEC");

        //Displaying the updated first thread information
        System.out.println(t1);

    }
}