package UNIT0;
/*
WAP to demonstrate default values of static variables of all primitive data
types & the reference type `String` without explicitly initializing them. 
Display their default values in the specified format.
*/
public class DefaultValuesOfStaticVariables {

    // Declaring static variables without assigning values
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;
    static String defaultString;

    public static void main(String[] args) {

        //Printing the default value of each static variable
        System.out.println("Default value of byte is " + defaultByte);
        System.out.println("Default value of short is " + defaultShort);
        System.out.println("Default value of int is " + defaultInt);
        System.out.println("Default value of long is " + defaultLong);
        System.out.println("Default value of float is " + defaultFloat);
        System.out.println("Default value of Double is " + defaultDouble);
        System.out.println("Default value of char is [" + defaultChar + " ]");
        System.out.println("Default value of Boolean is " + defaultBoolean);
        System.out.println("Default value of String is " + defaultString);
    }
}