interface Dimensions{
	int x=20; int y=20;
}
class Room implements Dimensions{
	int area()
	{
		return x*y;
	}
}
class Variables_Interfaces2{
	public static void main(String arg[]){
		Room r=new Room();
		System.out.println("Area:"+r.area());
	}
}