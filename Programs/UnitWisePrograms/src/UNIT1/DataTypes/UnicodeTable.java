package UNIT1.DataTypes;
//WAP in Java to display Unicode characters, their Unicode escape sequences and decimal values from 0 to 65535.

public class UnicodeTable {
    
    public static void main(String[] args) {
        //Displaying the Unicode table heading
        System.out.println("Character\tUnicode\t\tDecimal");

        //Displaying Unicode characters from 0 to 65535
        for (int i = 0; i <= 65535; i++) {
                System.out.printf("%c\t\t\\u%04X\t\t%d%n", (char) i, i, i);
        }
    }
    
}