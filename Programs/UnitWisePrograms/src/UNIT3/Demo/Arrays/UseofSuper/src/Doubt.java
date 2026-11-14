class A3{
	int x=10;
}
class B3 extends A3{
	int x=30; 
}
class C3 extends B3{
	int x=100;
	void display(){
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(super.super.x); //Not allowed in JAVA
  }
}
class Doubt{
	public static void main(String arg[]){
		C3 c=new C3();
		c.display();
	}
}