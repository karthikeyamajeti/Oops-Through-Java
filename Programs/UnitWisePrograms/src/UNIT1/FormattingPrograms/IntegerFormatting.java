package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate integer formatting using the printf() method.

public class IntegerFormatting{

    public static void main(String[] args) {

        //Declaring and initializing an integer variable
        int p = 73;

        //Displaying the integer using %d
        System.out.printf("%d\n", p);

        //Displaying the integer inside vertical bars
        System.out.printf("|%d|\n", p);

        //Displaying the integer left-aligned within a width of 20 characters
        System.out.printf("|%-20d|\n", p);

        //Displaying the negative integer right-aligned within a width of 20 characters
        System.out.printf("|%20d|\n", -p);

        //Displaying the positive integer left-aligned within a width of 20 characters
        System.out.printf("|%-20d|\n", p);

        //Displaying the negative integer left-aligned within a width of 20 characters
        System.out.printf("|%-20d|\n", -p);

    }
}