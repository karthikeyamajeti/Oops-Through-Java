/* Create a class that extends Thread class */
class MyClass22 extends Thread
{
	MyClass22(String n){
		setName(n);
		start(); 
	}
	/* Entry point for thread */
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			try{
				System.out.println(Thread.currentThread().getName()+":"+i);
				sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class ThreadExtendsMultiple 
{
	public static void main(String arg[])
	{
		 new MyClass22("One");
		 new MyClass22("Two");
		 new MyClass22("Three");
	}
}
