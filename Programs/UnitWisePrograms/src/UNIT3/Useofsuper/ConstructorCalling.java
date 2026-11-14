class A1 {
	A1() {
		System.out.println("Inside A's constructor.");
	}
}
class B1 extends A1 
{
	B1() {
		 
		System.out.println("Inside B's constructor.");
	}
}
class C1 extends B1 {
	C1() {
		System.out.println("Inside C's constructor.");
	}
}
class D1 extends C1 {
	D1() {
		System.out.println("Inside D's constructor.");
	}
}
class ConstructorCalling 
{
	public static void main(String args[]) 
	{
		D1 d = new D1();
	}
}