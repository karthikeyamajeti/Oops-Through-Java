package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multiple threads using the Runnable interface to print even and odd numbers.
class MyClass13 implements Runnable {

    //Overriding the run() method to define even number thread execution
    public void run() {

        //Initializing the counter
        int i=1;

        //Checking numbers from 1 to 100
        while (i <= 100){

            //Checking and printing even numbers
            if(i%2== 0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }

            //Incrementing the counter
            i++;

            try{
                //Pausing the thread for 2 seconds
                Thread.sleep(2000);
            }
            catch(Exception e){
                //Handling exceptions
            }
        }
    }
}

class MyClass23 implements Runnable {

    //Overriding the run() method to define odd number thread execution
    public void run() {

        //Initializing the counter
        int i = 1;

        //Checking numbers from 1 to 100
        while (i <= 100) {

            //Checking and printing odd numbers
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }

            //Incrementing the counter
            i++;

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

public class RunnableEvenOdd{

    public static void main(String arh[]) {

        //Creating a thread object for even numbers
        Thread t1 = new Thread(new MyClass13());

        //Starting the even number thread
        t1.start();

        //Assigning a name to the even number thread
        t1.setName("Even");

        //Creating a thread object for odd numbers
        Thread t2 = new Thread(new MyClass23());

        //Starting the odd number thread
        t2.start();

        //Assigning a name to the odd number thread
        t2.setName("Odd");

    }
}