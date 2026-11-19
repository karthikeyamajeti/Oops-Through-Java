package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate thread priorities using high, medium, and low priority threads.

public class ThreadPriority extends Thread {

    //Creating a constructor to initialize the thread name
    public ThreadPriority(String name) {

        //Assigning a name to the thread
        setName(name);

    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Executing the task five times
        for (int i = 1; i <= 5; i++) {

            //Displaying the thread name, priority, and task number
            System.out.println(Thread.currentThread().getName() + " (priority "
                    + Thread.currentThread().getPriority() + ") - Task " + i);

        }
    }

    public static void main(String[] args) {

        //Creating three thread objects
        ThreadPriority hpt = new ThreadPriority("High-Priority Thread");
        ThreadPriority mpt = new ThreadPriority("Medium-Priority Thread");
        ThreadPriority lpt = new ThreadPriority("Low-Priority Thread");

        //Assigning maximum priority (10) to the high-priority thread
        hpt.setPriority(Thread.MAX_PRIORITY);

        //Assigning normal priority (5) to the medium-priority thread
        mpt.setPriority(Thread.NORM_PRIORITY);

        //Assigning minimum priority (1) to the low-priority thread
        lpt.setPriority(Thread.MIN_PRIORITY);

        //Starting the low-priority thread
        lpt.start();

        //Starting the medium-priority thread
        mpt.start();

        //Starting the high-priority thread
        hpt.start();

    }
}