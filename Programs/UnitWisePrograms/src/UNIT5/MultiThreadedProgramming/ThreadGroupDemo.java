package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing multiple threads using the ThreadGroup class.

class TG1 implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread name
        System.out.println(Thread.currentThread().getName());
    }
}

class TG2 implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread name
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadGroupDemo {

    public static void main(String[] args) {

        //Creating two thread groups
        ThreadGroup tg1 = new ThreadGroup("Thread Group1");
        ThreadGroup tg2 = new ThreadGroup("Thread Group2");

        //Displaying the first thread group name
        System.out.println("Thread Group Name: " + tg1.getName());

        //Creating and starting threads in the first thread group
        Thread t1 = new Thread(tg1, new TG1(), "one");
        t1.start();

        Thread t2 = new Thread(tg1, new TG1(), "two");
        t2.start();

        //Displaying the second thread group name
        System.out.println("Thread Group Name: " + tg2.getName());

        //Creating and starting threads in the second thread group
        Thread t3 = new Thread(tg2, new TG2(), "three");
        t3.start();

        Thread t4 = new Thread(tg2, new TG2(), "four");
        t4.start();

    }
}