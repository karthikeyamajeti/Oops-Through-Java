package UNIT1.TypesofVariables;
//WAP in Java to demonstrate accessing a static variable using the class name and object reference.

class A {
	//Declaring a static variable (class variable)
	static int i = 100;
}

public class StaticVariableAccess {
	public static void main(String[] args) {
		//Accessing the static variable through the class name
		System.out.println(A.i);

		//Creating an object of class A
		A a = new A();

		//Accessing the static variable through the object reference
		System.out.println(a.i);
	}
}