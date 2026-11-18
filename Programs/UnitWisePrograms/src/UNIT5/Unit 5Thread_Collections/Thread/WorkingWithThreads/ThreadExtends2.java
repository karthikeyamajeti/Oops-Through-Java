  /* Create a class that extends Thread class */
class MyClass1 extends Thread
{
	/* In this class, override run() method */
	
	public void run()
	{
		for(int i=1;i<200;i++)
		{
			try{
				if(i%2==0)
					System.out.println("Child:"+i);
				sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class ThreadExtends2
{
	public static void main(String arg[])
	{
		/*Create an object to  MyClass and run method is available for execution*/

		MyClass1 mc = new MyClass1();
		mc.start();

		for(int i=1;i<200;i++)
		{
			try{
				if(i%2!=0)
					System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
 
