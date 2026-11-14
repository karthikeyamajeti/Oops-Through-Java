 
class Bike1  
{  
	final int speed_limit=30;
	
	void run()	
	{
		speed_limit=speed_limit+20; //error
		System.out.println("Vehicle running safely with:"+speed_limit  +" kmph");
	}  
}
     
class FinalVariable
{  
	public static void main(String args[])
	{  
   		Bike1 b= new Bike1();  
		b.run();  
	}  
}  