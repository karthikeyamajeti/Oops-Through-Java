class MyClass10 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("hi PVPSIT");
			
			try{ sleep(1000);} catch(Exception e) {}
			}
		
			}
}

public class ThreadCreationExtends {
	public static void main(String arg[]) {
		MyClass10 mc=new MyClass10();
		mc.start();
	}
}
