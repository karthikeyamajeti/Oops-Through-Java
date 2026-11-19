package UNIT1.EscapeSequences;
//WAP in Java to demonstrate displaying characters and words using octal escape sequences.

public class OctalEscapeSequences{

    public static void main(String[] args) {

        //Displaying uppercase letters using octal codes
        System.out.println("Uppercase Letters");
        System.out.println("\101 \102 \103 \132");

        //Displaying lowercase letters using octal codes
        System.out.println("\nLowercase Letters");
        System.out.println("\141 \142 \143 \172");

        //Displaying digits using octal codes
        System.out.println("\nDigits");
        System.out.println("\060 \061 \062");

        //Displaying the word JAVA using octal codes
        System.out.println("\nWord using Octal Codes");
        System.out.println("\112\101\126\101"); //JAVA

        //Displaying the name SURESH using octal codes
        System.out.println("\nName");
        System.out.println("\123\125\122\105\123\110"); //SURESH

    }
}