interface One{
	double PI=3.14;
}
interface Two extends One{
	double radius=2;
}
interface Three extends One, Two{
	double area();
}
class Circle1 implements Three{
	public double area(){
		return PI*radius*radius;
	}
}
class Interface_Inheritance{
	public static void main(String ar[])
	{
		Circle1 c=new Circle1();
		System.out.println("Area:"+c.area());
	}
}