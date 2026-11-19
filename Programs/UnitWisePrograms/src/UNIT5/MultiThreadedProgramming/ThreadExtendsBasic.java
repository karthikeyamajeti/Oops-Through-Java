/* Create a class that extends Thread class */
class MyClass0 extends Thread 
{
	/* In this class, overwrite run() method */ 
	public void run()  
	{
		for(;;) { 
			System.out.println("Hi PVPSIT");
		}
		 
	}
}
class ThreadExtendsBasic
{
	public static void main(String arg[])
	{
	   /*Create an object to  MyClass */
		MyClass0 mc = new MyClass0();
		mc.start();
	}
}  