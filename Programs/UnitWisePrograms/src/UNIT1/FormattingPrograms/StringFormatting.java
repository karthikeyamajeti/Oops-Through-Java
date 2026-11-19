package UNIT1.FormattingPrograms;
//WAP in Java to demonstrate string formatting using the printf() method.

public class StringFormatting{

    public static void main(String[] args) {

        //Declaring and initializing a String variable
        String str = "Amaravati is the Capaital of AP";

        //Displaying the complete string
        System.out.printf("%s\n", str);

        //Displaying the string right-aligned within a width of 50 characters
        System.out.printf("%50s\n", str);

        //Displaying only the first 12 characters of the string
        System.out.printf("%.12s\n", str);

        //Displaying the first 12 characters right-aligned within a width of 20 characters
        System.out.printf("%20.12s\n", str);

        //Displaying the first 12 characters left-aligned within a width of 20 characters
        System.out.printf("%-20.12s\n", str);

    }
}