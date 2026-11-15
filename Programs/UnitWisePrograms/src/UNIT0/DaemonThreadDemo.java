package UNIT0;
/*
WAP to demonstrate daemon threads by creating three threads.
Set one thread as a daemon thread and the remaining two as user threads.
Display whether each thread is a daemon thread or not.
*/
class MyThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("This is daemon thread");
        }
        else {
            System.out.println("This is not a daemon thread");
        }
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) {

        // Creating three threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Setting t1 as daemon thread
        t1.setDaemon(true);

        // Starting all three threads
        t1.start();
        t2.start();
        t3.start();
    }
}