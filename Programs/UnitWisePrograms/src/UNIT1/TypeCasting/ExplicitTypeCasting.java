package UNIT1.TypeCasting;

//WAP in Java to demonstrate explicit type casting.

public class ExplicitTypeCasting {

    public static void main(String args[]) {

        //Declaring a byte variable
        byte b;

        //Initializing integer and double variables
        int i = 257;
        double d = 323.142;

        //Converting int into byte explicitly
        System.out.println("\nConversion of int to byte.");
        b = (byte) i;

        //Displaying the original and converted values
        System.out.println("i and b " + i + " -> " + b);

        //Converting double into int explicitly
        System.out.println("\nConversion of double to int.");
        i = (int) d;

        //Displaying the original and converted values
        System.out.println("d and i " + d + " -> " + i);

        //Converting double into byte explicitly
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;

        //Displaying the original and converted values
        System.out.println("d and b " + d + " -> " + b);

    }
}