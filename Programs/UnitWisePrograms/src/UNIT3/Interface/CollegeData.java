interface Teacher1
{
	void display1();
}
interface Student1
{
	void display2();
}
class College1 implements Teacher1, Student1
{
	public void display1()
	{
		System.out.println("Hi I am Teacher");
	}
	public void display2()
	{
		System.out.println("Hi I am Student");
	}
}
class CollegeData
{
	public static void main(String arh[])
	{
		College1 c=new College1();
		c.display1();
		c.display2();
	}
}