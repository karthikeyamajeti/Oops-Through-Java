final class Vehicle2
{
    void run()
	{
		System.out.println("running");
	}  
}
class Bike2 extends Vehicle2
{  
	void run()	
	{
		System.out.println("running safely with 100 kmph");
	}  
} 
class FinalMethod
{  
	public static void main(String args[])
	{  
   		Bike2 b= new Bike2();  
		b.run();  
	}  
}  