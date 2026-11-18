 class MyClass5 implements Runnable
{
	/* In this class, implement run() method */ 
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(i);
			 //Thread.sleep(1000); 
		}
	}
}
class ImplementsRunnable 
{
	public static void main(String arg[])
	{
		/*Create an object to  MyClass and run method is 
		available for execution*/
		MyClass5 mc = new MyClass5();

	    Thread t=new Thread(mc);
	    t.start();
	}
}
