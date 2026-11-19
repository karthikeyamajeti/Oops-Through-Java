package UNIT1.DataTypes;
//WAP in Java to demonstrate Unicode characters and display their decimal values.

public class UnicodeDemo {
    
    public static void main(String[] args) {
        
        //Declaring and initializing characters using Unicode escape sequences
        char ch1 = '\u0041';   //A
        char ch2 = '\u0031';   //1
        char ch3 = '\u0040';   //@
        char ch4 = '\u0061';   //a

        //Displaying the Unicode character table heading
        System.out.println("-----------------------------------------------");
        System.out.println("Character\tUnicode\t\tDecimal Value");
        System.out.println("-----------------------------------------------");

        //Displaying characters, Unicode values and decimal values
        System.out.println(ch1 + "\t\t\\u0041\t\t" + (int) ch1);
        System.out.println(ch2 + "\t\t\\u0031\t\t" + (int) ch2);
        System.out.println(ch3 + "\t\t\\u0040\t\t" + (int) ch3);
        System.out.println(ch4 + "\t\t\\u0061\t\t" + (int) ch4);

        //Displaying the Unicode and decimal ranges of char
        System.out.println("-----------------------------------------------");
        System.out.println("Unicode Range : \\u0000 to \\uFFFF");
        System.out.println("Decimal Range : " + (int) Character.MIN_VALUE +
                        " to " + (int) Character.MAX_VALUE);
    }
}