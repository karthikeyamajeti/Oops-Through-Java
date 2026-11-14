abstract class MyClass
{
	 abstract void calculate(double x);
}
class Stu1 extends MyClass
{
	void calculate (double x)
	{
		System.out.println("Square  :"+(x*x));
	}
}	
class Stu2 extends MyClass
{
	void calculate(double x)
	{
		System.out.println("Square Root :"+Math.sqrt(x));
	}
}
class Stu3 extends MyClass
{
	void calculate(double x)
	{
		System.out.println("Cube :"+(x*x*x));
	}
}
class AC
{
	public static void main(String arg[])
	{	
		MyClass mc;
		Stu1 obj1=new Stu1();
		Stu2 obj2=new Stu2();
		Stu3 obj3=new Stu3();
		
		mc=obj1;
		mc.calculate (20);
		obj2.calculate(20);
		obj3.calculate(20);
	}
}

	