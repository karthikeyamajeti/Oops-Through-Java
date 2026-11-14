// Demonstrate when constructors are called.
// Create a super class.
class A2 {
	A2(int a ) {
		a++;
		System.out.println("Inside A's constructor:"+a);
	}
}
// Create a subclass by extending class A.
class B2 extends A2 
{
	B2(int b) {
		super(9);	
		b++;
		System.out.println("Inside B's constructor:"+b);
	}
}
// Create another subclass by extending B.
class C2 extends B2 {
	C2() {
		super(10);
		System.out.println("Inside C's constructor.");
	}
}
class Constructor_Executing 
{
	public static void main(String args[]) 
	{
		C2 c = new C2();
	}
}













