package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads executing simultaneously with different sleep intervals.

class MyClass1 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously printing the current thread name
        for (;;) {

            System.out.println(Thread.currentThread().getName());

            try {

                //Pausing the thread for 1 second
                Thread.sleep(1000);
            }
            catch (Exception e) {
                //Handling exceptions
            }
        }
    }
}

class MyClass2 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously printing the current thread name
        for (;;) {

            System.out.println(Thread.currentThread().getName());

            try {

                //Pausing the thread for 2 seconds
                Thread.sleep(2000);
            }
            catch (Exception e) {
                //Handling exceptions
            }
        }
    }
}

class MyClass3 extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Continuously printing the current thread name
        for (;;) {

            System.out.println(Thread.currentThread().getName());

            try {

                //Pausing the thread for 3 seconds
                Thread.sleep(3000);
            }
            catch (Exception e) {
                //Handling exceptions
            }
        }
    }
}

public class MultipleThreadsWithDifferentSleep{

    public static void main(String ar[]) {

        //Creating three thread objects
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        MyClass3 mc3 = new MyClass3();

        //Assigning names to the threads
        mc1.setName("GM");
        mc2.setName("GA");
        mc3.setName("GE");

        //Starting all three threads
        mc1.start();
        mc2.start();
        mc3.start();

    }
}