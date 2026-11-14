class A1
{
	void callMe()
	{
		System.out.println("Inside A");
	} 
}
class B1 extends A1
{
	@Override
	void callMe()
	{
		System.out.println("Inside B");
	}
}
class C1 extends B1
{
	@Override
	void callMe()
	{
		System.out.println("Inside C");
	}
}
class MethodOverriding
{	public static void main(String args[])
	{
		A1 a=new A1();
		B1 b = new B1();
		C1 c = new C1();
		a.callMe();
		b.callMe();
		c.callMe();
	}
}