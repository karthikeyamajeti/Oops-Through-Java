package UNIT1.EscapeSequences;
//WAP in Java to demonstrate displaying different symbols using Unicode escape sequences.

public class UnicodeSymbolsDemo {

    public static void main(String[] args) {

        //Displaying intellectual property symbols
        System.out.println("===========================================");
        System.out.println("      INTELLECTUAL PROPERTY SYMBOLS");
        System.out.println("===========================================");
        System.out.println("Copyright           : \u00A9");
        System.out.println("Registered Trademark: \u00AE");
        System.out.println("Trademark           : \u2122");
        System.out.println("Service Mark        : \u2120");
        System.out.println("Sound Recording     : \u2117");

        //Displaying common Unicode symbols
        System.out.println("\n===========================================");
        System.out.println("         COMMON UNICODE SYMBOLS");
        System.out.println("===========================================");
        System.out.println("Ampersand           : \u0026");
        System.out.println("Bullet              : \u2022");
        System.out.println("White Bullet        : \u25E6");
        System.out.println("Bullet Operator     : \u2219");
        System.out.println("Triangular Bullet   : \u2023");
        System.out.println("Hyphen Bullet       : \u2043");
        System.out.println("Degree              : 90\u00B0");
        System.out.println("Infinity            : \u221E");

        //Displaying currency symbols
        System.out.println("\n===========================================");
        System.out.println("          CURRENCY SYMBOLS");
        System.out.println("===========================================");
        System.out.println("Indian Rupee        : \u20B9");
        System.out.println("Dollar              : \u0024");
        System.out.println("Euro                : \u20AC");
        System.out.println("Pound               : \u00A3");
        System.out.println("Yen / Yuan          : \u00A5");

    }
}