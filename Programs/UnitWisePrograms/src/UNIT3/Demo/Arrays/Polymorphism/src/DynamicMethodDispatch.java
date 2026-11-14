class A
{
	void callMe()
	{
		System.out.println("Inside A");
	} 
}
class B extends A
{
	@Override
	void callMe()
	{
		System.out.println("Inside B");
	}
}
class C extends B
{
	@Override
	void callMe()
	{
		System.out.println("Inside C");
	}
}
class DynamicMethodDispatch
{	
	public static void main(String args[])
	{
		A a=new A();
		B b = new B();
		C c = new C();
		A ref;
		
		ref = a;    
		ref.callMe();

		ref = b;    
		ref.callMe();
		
		ref=c;
		ref.callMe();
	}
}