package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate formatting different data types and converting decimal numbers into hexadecimal and octal formats.

public class FormattingExample {

    public static void main(String[] args) {

        //Declaring and initializing variables
        int n = 713;
        float x = 45.86f;
        double dbl = 56.754;
        String str = "Amaravati";
        char ch = 'V';

        //Displaying an integer value
        System.out.printf("Integer            : %d%n", n);

        //Displaying a float value
        System.out.printf("Float              : %f%n", x);

        //Displaying a double value
        System.out.printf("Double             : %f%n", dbl);

        //Displaying a character in uppercase
        System.out.printf("Character          : %C%n", ch);

        //Displaying a string
        System.out.printf("String             : %s%n", str);

        //Converting a decimal number into hexadecimal format
        System.out.printf("Decimal(163) to Hexadecimal 163:%X\n", 163);

        //Converting a decimal number into octal format
        System.out.printf("Decimal(163) to Octal :%o\n", 163);

    }
}