package UNIT1.TypesofVariables;
//WAP in Java to demonstrate the default values of different data types and String.

class Student {
    //Declaring instance variables of different data types
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean flag;
    String str;
}

public class DefaultValues {
    
    public static void main(String[] args) {
        
	//Creating an object of the Student class
	Student obj = new Student();
        
	//Displaying the default values of instance variables
	System.out.println("byte    = " + obj.b);
        System.out.println("short   = " + obj.s);
	System.out.println("int     = " + obj.i);
	System.out.println("long    = " + obj.l);
	System.out.println("float   = " + obj.f);
	System.out.println("double  = " + obj.d);
	System.out.println("char    = " + obj.c);
	System.out.println("boolean = " + obj.flag);
        System.out.println("String  = " + obj.str);
    }
}