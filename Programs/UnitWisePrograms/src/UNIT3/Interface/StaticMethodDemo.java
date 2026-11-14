interface NewInterface {
    static void staticMethod()    // static method
    {
        System.out.println("Hello, I am  Static Method");
    }
   // Public and abstract method of Interface
    void overrideMethod(String str);
} 
public class StaticMethodDemo implements NewInterface {
     
	// Implementing interface method
	@Override
    public void overrideMethod(String str){ 
		System.out.println(str);
    }	
	public static void main(String[] args)
    {
        StaticMethodDemo s= new StaticMethodDemo();
        s.overrideMethod("Hello, I am override Method"); 
		NewInterface.staticMethod();
    }
}