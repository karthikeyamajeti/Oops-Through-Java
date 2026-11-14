class Base{
	Base(){ System.out.println("Hi");}
}
class Derived extends Base {}

public class ConstructorDefault {
	public static void main(String[] args) {
		Derived d =new Derived();
	}
}
