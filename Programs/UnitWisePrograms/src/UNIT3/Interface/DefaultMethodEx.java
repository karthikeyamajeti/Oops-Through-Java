interface Interface1 
{ 
    void interface1();
    default void show(int x) // default method 
    { 
        System.out.println("Default Method of Interface 1 "+x); 
    } 
} 
interface Interface2 
{ 
     void interface2();
    default void show(double x) // Default method 
    { 
        System.out.println("Default Method of Interface 2 "+x); 
    } 
	
} 
class TestClass implements Interface1, Interface2 
{ 
	public void interface1(){
		System.out.println("Interface 1 method implemented in TC");
	}
	public void interface2(){
		System.out.println("Interface 2 method implemented in TC");
	}
} 
class DefaultMethodEx{
	public static void main(String args[]) 
    { 
        TestClass d = new TestClass(); 
        d.interface1();
		d.interface2(); 
		d.show(10); 
    } 
}