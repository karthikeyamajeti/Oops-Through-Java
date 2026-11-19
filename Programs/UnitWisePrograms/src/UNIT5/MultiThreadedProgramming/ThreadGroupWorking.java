package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate creating and executing threads using different thread groups.

class AIMLThread implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread information
        System.out.println(Thread.currentThread());
    }
}

class DSThread implements Runnable {

    //Overriding the run() method to define thread execution
    public void run() {

        //Displaying the current thread information
        System.out.println(Thread.currentThread());
    }
}

public class ThreadGroupWorking {

    public static void main(String[] args) {

        //Creating a thread group named AIML
        ThreadGroup tg1 = new ThreadGroup("AIML");

        //Creating a thread group named DS
        ThreadGroup tg2 = new ThreadGroup("DS");

        //Displaying the AIML thread group name
        System.out.println("Thread Group Name: " + tg1.getName());

        //Creating an object of AIMLThread
        AIMLThread ai = new AIMLThread();

        //Creating and starting the first thread in AIML group
        Thread t1 = new Thread(tg1, ai);
        t1.start();

        //Creating and starting the second thread in AIML group
        Thread t2 = new Thread(tg1, ai);
        t2.start();

        //Displaying the DS thread group name
        System.out.println("Thread Group Name: " + tg2.getName());

        //Creating and starting the first thread in DS group
        Thread t3 = new Thread(tg2, new DSThread(), "4401");
        t3.start();

        //Creating and starting the second thread in DS group
        Thread t4 = new Thread(tg2, new DSThread(), "4402");
        t4.start();

    }
}