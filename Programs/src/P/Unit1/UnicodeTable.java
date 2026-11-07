package P.Unit1;
public class UnicodeTable {
    public static void main(String[] args) {

        System.out.println("Character\tUnicode\t\tDecimal");

        for (int i = 0; i <= 65535; i++) {
            System.out.printf("%c\t\t\\u%04X\t\t%d%n", (char)i, i, i);
        }
    }
}