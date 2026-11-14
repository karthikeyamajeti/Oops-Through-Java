interface Teacher
{
	void display1();
}
interface Student
{
	void display2();
}
interface T_S extends Teacher, Student
{
	void display3();
}
class College implements T_S
{
	public void display1()
	{
		System.out.println("Hi I am Teacher");
	}
	public void display2()
	{
		System.out.println("Hi I am Student");
	}
	public void display3()
	{
		System.out.println("Hi I am Teacher_Student");
	}
}
class Class_Interface 
{
	public static void main(String arh[])
	{
		College c=new College();
		c.display1();
		c.display2();
		c.display3();
	 }
	
}









