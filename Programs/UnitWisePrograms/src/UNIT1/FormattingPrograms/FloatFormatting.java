package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate different floating-point formatting options using the printf() method.

public class FloatFormatting{

    public static void main(String[] args) {

        //Declaring and initializing a double variable
        double x = 56748326.567853;

        //Displaying the floating-point number using %f
        System.out.printf("%f\n", x);

        //Displaying the floating-point number inside vertical bars
        System.out.printf("|%f|\n", x);

        //Displaying the number right-aligned within a width of 20 characters
        System.out.printf("%20f\n", x); //Width 20 - right alignment

        //Displaying the number with 2 digits after the decimal point
        System.out.printf("%.2f\n", x);

        //Displaying the number right-aligned within a width of 20 characters with 2 decimal places
        System.out.printf("%20.2f\n", x);

        //Displaying the number left-aligned within a width of 20 characters with 2 decimal places
        System.out.printf("%-20.2f\n", x);

        //Displaying the number with commas as thousands separators
        System.out.printf("With Commas : %,.2f%n", x); //Thousands separator

        //Displaying the number in scientific notation
        System.out.printf("%e\n", x);

    }
}