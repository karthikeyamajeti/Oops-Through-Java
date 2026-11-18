 
class Thread_Default_Parameter
{
	public static void main(String arg[]){
  
		Thread t1=new Thread();
		Thread t2=new Thread("PVPSIT"); 
		System.out.println("Current Thread:"+Thread.currentThread());
		System.out.println("Child Thread t1:"+t1);
		System.out.println("Child Thread t2:"+t2);
 
	}
}
