package UNIT1.DataTypes;
//WAP in Java to display character values from 0 to 255 using ASCII values.

public class ASCIIValues {
    
    public static void main(String[] args) {
        
        //Displaying the table heading
        System.out.println("ASCII Table (0 - 255)");
        System.out.println("----------------------------");
        System.out.println("Decimal\tCharacter");

        //Displaying decimal values and their corresponding characters
        for (int i = 0; i <= 255; i++) {
                System.out.println(i + "\t\t" + (char) i);
        }
    }
}

//Using printf for formatted output
//System.out.printf("%-8d %-10c%n", i, (char) i);