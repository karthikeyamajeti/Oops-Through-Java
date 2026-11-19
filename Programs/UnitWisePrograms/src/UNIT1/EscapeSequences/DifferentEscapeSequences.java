package UNIT1.EscapeSequences;
//WAP in Java to demonstrate the use of different escape sequences.

public class DifferentEscapeSequences{

    public static void main(String[] args) {

        //Demonstrating the newline escape sequence
        System.out.println("Hello\nJava");

        //Demonstrating the horizontal tab escape sequence
        System.out.println("Java\tProgramming");

        //Demonstrating the backspace escape sequence
        System.out.println("ABC\bD"); //Execute in Command Prompt

        //Demonstrating the carriage return escape sequence
        System.out.println("Hello\rJava");

        //Demonstrating the form feed escape sequence
        System.out.println("Hello\fWorld"); //May not work as expected in modern consoles

        //Displaying a single quotation mark
        System.out.println('\'');

        //Displaying double quotation marks inside a string
        System.out.println("He said, \"Hi\"");

        //Displaying a backslash in a string
        System.out.println("C:\\Java");

    }
}