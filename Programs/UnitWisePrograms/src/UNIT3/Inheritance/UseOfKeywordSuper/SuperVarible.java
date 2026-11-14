//Without super
class Vehicle1
{  
	int speed=50;  
}  
class Bike1 extends Vehicle1
{  
	  int speed=100;  
	  void display()
	  {  
		  System.out.println("Vehicle Speed:"+super.speed);
		  System.out.println("Bike Speed:"+speed);//will print speed of bike
	  }  
}
class SuperVarible
{
 	public static void main(String args[])
	  {  
		   Bike1 b=new Bike1();  
		   b.display();  
	  }  
}