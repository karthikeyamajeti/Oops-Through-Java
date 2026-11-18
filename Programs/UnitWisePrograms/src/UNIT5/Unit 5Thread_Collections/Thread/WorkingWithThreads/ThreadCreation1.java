class AIML extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try { 
				sleep(10000);
				} catch(Exception e) {}
			}
	}
}
public class ThreadCreation1 {
	public static void main(String args[]) throws Exception{
		AIML ai=new AIML();
		ai.start();
		System.out.println("Prior to join"+ai.isAlive());
		ai.join();
		System.out.println("After join"+ai.isAlive());
		System.out.println(Thread.currentThread().getName()+" Teriminated");
	}
}
