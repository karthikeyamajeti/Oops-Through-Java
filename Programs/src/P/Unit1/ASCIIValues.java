package P.Unit1;
public class ASCIIValues {
    public static void main(String[] args) {

        System.out.println("ASCII Table (0 - 255)");
        System.out.println("----------------------------");
        System.out.println("Decimal\tCharacter");

        for (int i = 0; i <= 255; i++) {
            System.out.println(i + "\t\t" + (char)i);
        }
    }
}


//System.out.printf("%-8d %-10c%n", i, (char) i);