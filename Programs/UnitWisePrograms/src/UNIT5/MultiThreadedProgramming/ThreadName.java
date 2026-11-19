public class ThreadName {
	public static void main(String args[]) {
		Thread t1=new Thread();
		Thread t2=new Thread("PVPSIT");
		System.out.println(Thread.currentThread());
		System.out.println(t1);
		System.out.println(t2);
		t1.setName("BEC");
		System.out.println(t1);   
	}
}
