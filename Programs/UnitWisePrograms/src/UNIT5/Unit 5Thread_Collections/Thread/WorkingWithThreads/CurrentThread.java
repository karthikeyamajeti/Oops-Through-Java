public class CurrentThread  
{
	public static void main(String arg[]) throws Exception
	{
		Thread t=Thread.currentThread(); 
		
		System.out.println("Current Thread:"+t);
		
		System.out.println("Current Thread Name:"+t.getName());
		
	}
}

/*
t.setName("PVPSIT");
System.out.println("Current Thread Name:"+t.getName());
t.setPriority(2);
System.out.println("After Changing of Priority:"+ t.getPriority()); 

System.out.println("prior to sleep");
t.sleep(10000); 

System.out.println("Current Thread Name:"+t.getName());

*/