package UNIT1.TypesofVariables;
//WAP in Java to demonstrate the declaration and initialization of a local variable.
public class DemoOnLocalVariable {
    public static void main(String[] args) {
	//Declaring a local variable
	int x;
        
	//Attempting to access an uninitialized local variable causes a compile-time error
	//System.out.println(x);
        
	//Initializing the local variable
	x = 100;
        
	//Displaying the local variable
	System.out.println("x = " + x);
        
    }
}