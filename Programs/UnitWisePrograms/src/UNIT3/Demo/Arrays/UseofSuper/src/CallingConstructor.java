// Demonstrate when constructors are called.
// Create a super class.
class A {
	A() {
		System.out.println("Inside A's constructor.");
	}
}
// Create a subclass by extending class A.
class B extends A 
{
	B(int x) {
		super();
		System.out.println("Inside B's constructor."+x);
	}
}
// Create another subclass by extending B.
class C extends B {
	C() {
		super(200);
		System.out.println("Inside C's constructor.");
	}
}
class CallingConstructor 
{
	public static void main(String args[]) 
	{
		C c = new C();
	}
}