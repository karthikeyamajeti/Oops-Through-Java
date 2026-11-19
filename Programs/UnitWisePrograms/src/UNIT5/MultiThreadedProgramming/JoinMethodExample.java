package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate the use of the join() method to make the main thread wait until the child thread completes its execution.

class MyClass7 extends Thread {

    //Overriding the run() method to define child thread execution
    public void run() {

        //Printing numbers from 1 to 5
        for(int i=1; i<=5; i++) {

            //Displaying the child thread number
            System.out.println("Child Thread: " + i);

            try {

                //Pausing the child thread for 1 second
                Thread.sleep(1000);

            }
            catch (InterruptedException e) {

                //Displaying the exception
                System.out.println(e);

            }

        }
    }
}

public class JoinMethodExample{

    public static void main(String[] args) throws InterruptedException {

        //Creating an object of MyClass20
        MyClass7 t = new MyClass7();

        //Starting the child thread
        t.start();

        //Making the main thread wait until the child thread finishes
        t.join();

        //Displaying the completion message
        System.out.println("Main thread execution completed");

    }
}