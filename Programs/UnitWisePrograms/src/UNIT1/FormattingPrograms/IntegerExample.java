package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate integer formatting and conversion of a decimal number into binary using printf().

public class IntegerExample {

    public static void main(String[] args) {

        //Declaring and initializing an integer variable
        int p = 73;

        //Displaying the integer using %d
        System.out.printf("%d\n", p);

        //Displaying the integer inside vertical bars
        System.out.printf("|%d|\n", p);

        //Displaying the integer left-aligned within a width of 20 characters
        System.out.printf("|%-20d|\n", p);

        //Displaying the integer right-aligned within a width of 20 characters
        System.out.printf("|%20d|\n", p);

        //Converting the decimal number into binary
        System.out.printf("Binary of %d : %s%n", p, Integer.toBinaryString(p));

    }
}