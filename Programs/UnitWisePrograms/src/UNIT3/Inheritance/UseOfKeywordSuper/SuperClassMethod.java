class Student
{  
	 void message()
	{
		System.out.println("Good Morning Sir");
	}
}  
class Faculty extends Student
{  
	void message()
	{
		System.out.println("Good Morning Students");
	}
	void display()
	{  
		message();//will invoke or call current class message() method
		super.message();
	}  
}
class SuperClassMethod
{
	public static void main(String args[])
	{  
		Faculty f=new Faculty();  
		f.display();
	}
}