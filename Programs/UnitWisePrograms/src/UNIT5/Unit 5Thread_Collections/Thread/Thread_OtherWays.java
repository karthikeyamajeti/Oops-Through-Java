public class Thread_OtherWays
{ 
	public static void main(String[] args)  
	{  
		//Method reference 
		new Thread (Thread_OtherWays::method1).start(); 
		//The following line is Lambda expression  
		new Thread(() -> method2()).start(); 
		//The anonymous inner class 
		new Thread(new Runnable() 
		{  
		  public void run()  
		  { 
			method3();
		  } 
		}).start(); 
	} 
	static void method1() 
	{ 
	  System.out.println("It method reference thread.");  
	} 
	static void method2() 
	{ 
	  System.out.println("It is Lambda expression method thread."); 
	} 
	static void method3() 
	{ 
	  System.out.println("It is anonymous inner class thread."); 
	} 
} 