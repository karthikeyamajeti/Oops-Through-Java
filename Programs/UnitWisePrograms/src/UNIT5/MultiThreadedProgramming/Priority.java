package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate thread priorities using high, medium and low priority threads.

class Priority extends Thread {

    //Creating a constructor to initialize the thread name
    public Priority(String name) {
        super(name);
    }

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing five tasks performed by each thread
        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() +
                    " (priority " + Thread.currentThread().getPriority() +
                    ") - Task " + i);
        }
    }

    public static void main(String[] args) {

        //Creating high, medium and low priority threads
        Priority hpt = new Priority("High-Priority Thread");
        Priority mpt = new Priority("Medium-Priority Thread");
        Priority lpt = new Priority("Low-Priority Thread");

        //Setting the priorities of the threads
        hpt.setPriority(Thread.MAX_PRIORITY);
        mpt.setPriority(Thread.NORM_PRIORITY);
        lpt.setPriority(Thread.MIN_PRIORITY);

        //Starting the threads
        lpt.start();
        mpt.start();
        hpt.start();

    }
}