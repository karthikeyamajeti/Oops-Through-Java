/* Create a class that extends Thread class */
class MyClass extends Thread
{
	/* In this class, overwrite run() method */ 
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(i);
		 	try{ 
				sleep(5000);
			 }
			 catch(Exception e){ }
		}
	}
}
class Thread_Extends
{
	public static void main(String arg[])
	{
	   /*Create an object to  MyClass */
		MyClass mc = new MyClass();
		mc.start();
	}
}
