package UNIT5.MultiThreadedProgramming;
//WAP in Java to demonstrate the use of the join() method to execute threads sequentially.

class MyClassDemo extends Thread {

    //Overriding the run() method to define thread execution
    public void run() {

        //Printing numbers from 0 to 19
        for(int i=0; i<20; i++){

            //Displaying the thread name and current number
            System.out.println(getName()+" : "+i);
            try {
                //Pausing the current thread for 1 second
                sleep(1000);
            }
            catch(Exception e){
                //Handling exceptions
            }
        }
    }
}

public class DemonstratingUseofJoinMethod {

    public static void main(String args[]) throws Exception {

        //Creating three thread objects
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = new MyClass();

        //Assigning names to the threads
        mc1.setName("PVP");
        mc2.setName("VRSEC");
        mc3.setName("BEC");

        //Starting the first thread
        mc1.start();

        //Waiting until the first thread completes execution
        mc1.join();

        //Starting the second thread
        mc2.start();

        //Waiting until the second thread completes execution
        mc2.join();

        //Starting the third thread
        mc3.start();
    }
}