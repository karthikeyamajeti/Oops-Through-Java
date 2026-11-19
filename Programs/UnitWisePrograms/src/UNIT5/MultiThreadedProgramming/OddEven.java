class Printing extends Thread{
	Printing(){ 
		start();
		}
	public void run() 
	{
		for(int i=1; i<=200;i++) {
			if(i%2==0 && Thread.currentThread().getName().equals("Even")) 
			{
				System.out.println("Even Number:  "+i);
				try{ sleep(2000);} catch(Exception e) {}
			}
			if(i%2!=0 && Thread.currentThread().getName().equals("Odd")) {
				System.out.println("Odd Number:  "+i);
				try{ sleep(2000);} catch(Exception e) {}
			}
		}
	}
}
public class OddEven {
	public static void main(String args[]) {
		Printing e=new Printing();
		e.setName("Even");
		 
		Printing o=new Printing();
		o.setName("Odd");
	 
	}
}
