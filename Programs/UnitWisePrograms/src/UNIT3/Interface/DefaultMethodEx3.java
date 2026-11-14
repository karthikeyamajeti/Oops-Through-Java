interface Interface1 
{ 
    void interface1();
    default void show(int x) // default method 
    { 
        System.out.println("Default Method of Interface1 "+x); 
    } 
} 
interface Interface2 extends Interface1
{ 
    void interface2();
    default void show(int x) // Default method 
    { 
     Interface1.super.show(10);
		System.out.println("Default Method of Interface2 "+x); 
    } 
	
} 
class TestClass implements Interface1, Interface2 
{ 
	public void interface1(){
		System.out.println("Interface1 method implemented in TC");
	}
	public void interface2(){
		System.out.println("Interface2 method implemented in TC");
	}
} 
class DefaultMethodEx3{
	public static void main(String args[]) 
    { 
        TestClass d = new TestClass(); 
        d.interface1();
		d.interface2(); 
		d.show(10);
		d.show(10);
    } 
}