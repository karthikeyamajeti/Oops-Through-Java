package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multithreading by printing even numbers using a child thread and odd numbers using the parent thread.

class MyClass15 extends Thread {

    //Overriding the run() method to define child thread execution
    public void run() {

        //Printing even numbers from 0 to 199
        for (int i = 0; i < 200; i++) {

            try {

                //Checking and printing even numbers
                if (i % 2 == 0) {
                    System.out.println("Child:" + i);
                }

                //Pausing the child thread for 1 second
                sleep(1000);
            }
            catch (Exception e) {
                //Handling exceptions
            }
        }
    }
}

public class EvenOddUsingThreads {

    public static void main(String arg[]) {

        //Creating an object of MyClass
        MyClass15 mc = new MyClass15();

        //Starting the child thread
        mc.start();

        //Printing odd numbers from 0 to 199 using the parent thread
        for(int i=0; i<200; i++){

            try{

                //Checking and printing odd numbers
                if(i%2!=0){
                    System.out.println("Parent:" + i);
                }

                //Pausing the parent thread for 1 second
                Thread.sleep(1000);
            }
            catch(Exception e){
                //Handling exceptions
            }
        }

    }
}