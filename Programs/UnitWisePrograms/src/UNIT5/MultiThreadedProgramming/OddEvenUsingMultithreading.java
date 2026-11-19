package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate multithreading by printing odd numbers using a child thread and even numbers using the parent thread.
class MyClass extends Thread {

    //Overriding the run() method to define child thread execution
    public void run() {
        try {

            //Printing odd numbers from 0 to 199
            for (int i = 0; i < 200; i++) {

                if (i % 2 != 0) {
                    System.out.println("Child:" + i);

                    //Pausing the child thread for 1 second
                    Thread.sleep(1000);
                }
            }

        }
        catch (Exception e) {
            //Handling exceptions
        }
    }
}

public class OddEvenUsingMultithreading{

    public static void main(String ad[]) {

        //Creating a child thread object
        MyClass c = new MyClass();

        //Starting the child thread
        c.start();

        try {

            //Printing even numbers from 0 to 199 using the parent thread
            for (int i=0; i<200; i++) {

                if(i%2 == 0){
                    System.out.println("Parent:" + i);

                    //Pausing the parent thread for 1 second
                    Thread.sleep(1000);
                }
            }

        }
        catch (Exception e) {
            //Handling exceptions
        }

    }
}