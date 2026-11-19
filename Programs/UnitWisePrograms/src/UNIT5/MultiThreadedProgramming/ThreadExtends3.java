/* Create a class that extends Thread class */
class MyClass3 extends Thread
{
	MyClass3()
	{
		start();
	}
	/* Entry point for thread */
	public void run() 
	{
		for(int i=0;i<200;i++)
		{
			try{
			 	System.out.println(i);
				sleep(1000);
			}
			catch(Exception e){ }
		}
	}
}
class ThreadExtends3
{
	public static void main(String arg[])
	{
		 new MyClass3();
	}
} 