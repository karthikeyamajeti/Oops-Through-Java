class MyRunnable implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
	}
	public String toString() {
		return "Hello PVPSIT";
	}
}
public class ThreadNameRunnable {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread());
		MyRunnable mr=new MyRunnable();
		Thread t =new Thread(mr,"BEC");
		 
		t.start();
	}
}
