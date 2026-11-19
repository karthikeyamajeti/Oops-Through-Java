package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate string formatting and conversion of decimal numbers into hexadecimal and octal formats.

public class FormatStringExample{

    public static void main(String[] args) {

        //Declaring and initializing variables
        int n = 713;
        float x = 45.86f;
        double dbl = 56.754;
        String str = "Amaravati";
        char ch = 'V';

        //Displaying different data types using format specifiers
        //System.out.printf("%d %f %f %C \t %s\n", n, x, dbl, ch, str);

        //Converting a decimal number into hexadecimal format
        System.out.printf("Hexadecimal number of decimal 163: %X\n", 163);

        //Converting a decimal number into octal format
        System.out.printf("Octal number of decimal 163: %o\n", 163);

    }
}