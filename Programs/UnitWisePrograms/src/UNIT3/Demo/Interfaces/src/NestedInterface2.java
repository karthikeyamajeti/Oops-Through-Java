interface Shape{
	double getArea(double x);
 
	interface Display{
		public void show();
	}
}
class ABC implements Shape.Display{
	
	public void show(){
		System.out.println("Hi Welcome");
	}
}
class NestedInterface2{
	public static void main(String arg[]){
		ABC a=new ABC();
		 
		a.show();
	}
}





		
 

		
		