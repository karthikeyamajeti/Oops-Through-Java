final class Vehicle
{
  	 void run()
	{
		System.out.println("running");
	}  
}
class Bike extends Vehicle
{  
	void run()	
	{
		System.out.println("running safely with 100kmph");
	}  
}
     
class FinalClass
{  
	public static void main(String args[])
	{  
   		Bike b= new Bike();  
		b.run();  
	}  
}  




