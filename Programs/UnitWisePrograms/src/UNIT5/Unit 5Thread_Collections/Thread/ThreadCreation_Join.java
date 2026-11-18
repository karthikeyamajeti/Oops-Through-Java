 
class MyClass extends Thread
{  
	 
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(  getName()+     " :  "+i);
			try
			{
				sleep(1000);
			}
			catch(Exception e){}
		}
	}
	 
}
class ThreadCreation_Join
{
	public static void main(String args[]) throws Exception
	{ 
		 /* Main thread started*/
		MyClass mc1=new MyClass();
		 MyClass mc2=new MyClass(); 
		  MyClass mc3=new MyClass();

		 
		mc1.setName("PVP");
		mc2.setName("VRSEC");
		mc3.setName("BEC");
		
		mc1.start(); 
		// starting the second thread after when  
		// the first thread th1 has ended or died.  
		  
		mc1.join();  
		 mc2.start(); 
		// starting the th3 thread after when the thread th2 has ended or died. 
			mc2.join();
		 mc3.start();
		 
			 
	}
}