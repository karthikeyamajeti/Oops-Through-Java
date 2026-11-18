 class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread : "+Thread.currentThread().getName());
    }
}
public class ThreadClass_Runnable {
    public static void main(String[] args) { 
        Thread t  = new Thread(new MyRunnable(), "PVPSIT");
		t .start(); // Start the thread 
    }
}