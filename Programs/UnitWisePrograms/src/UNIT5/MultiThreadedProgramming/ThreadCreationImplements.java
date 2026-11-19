 class MyClass11 implements Runnable{
	public void run() {
		for(;;) {
			System.out.println("Hi PVPSIT.....");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class ThreadCreationImplements {
	public static void main(String args[]) {
		//MyClass11 mc=new MyClass11();
		Thread t=new Thread(new MyClass11());
		t.start();
	}
}
