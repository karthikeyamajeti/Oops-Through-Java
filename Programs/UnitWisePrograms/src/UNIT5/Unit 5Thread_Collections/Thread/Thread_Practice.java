/* Create a class that extends Thread class */
class MyClass extends Thread
{
	String name;
	MyClass(String n)
	{ 
		name=n;
		 start();
	}
	/* Entry point for thread */
	public void run()
	{
		for(;;)
		{
			String name=Thread.currentThread().getName();
			try
			{
			
				if(name.equals("Two"))
				{
			
					System.out.println("Siddhartha");
					sleep(3000);
				}
				else
				{
					System.out.println("PVP");
					sleep(3000);
				}
			}
			catch(Exception e){}
		}
	}
}
class Thread_Practice
{
	public static void main(String arg[])
	{
		 new MyClass("One");
		 new MyClass("Two");
	}
}