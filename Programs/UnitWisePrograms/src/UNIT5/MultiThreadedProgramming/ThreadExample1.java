package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate the current thread, changing its name, priority and using the sleep() method.

public class ThreadExample1 {

    public static void main(String arg[]) throws Exception {

        //Getting the currently executing thread
        Thread t = Thread.currentThread();

        //Displaying the current thread details
        System.out.println("Current Thread:" + t);

        //Displaying the current thread name
        System.out.println("Current Thread Name:" + t.getName());

        //Changing the current thread name
        t.setName("PVPSIT");
        System.out.println("Current Thread Name:" + t.getName());

        //Changing the thread priority
        t.setPriority(2);
        System.out.println("After Changing of Priority:" + t.getPriority());

        //Displaying a message before sleeping
        System.out.println("Prior to sleep");

        //Pausing the current thread for 10 seconds
        Thread.sleep(10000);

        //Displaying the thread name and priority after sleeping
        System.out.println("Current Thread Name:" + t.getName());
        System.out.println(t.getPriority());

    }
}