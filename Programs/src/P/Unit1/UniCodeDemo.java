package P.Unit1;
public class UniCodeDemo {

    public static void main(String[] args) {

        char ch1 = '\u0041';   // A
        char ch2 = '\u0031';   // 1
        char ch3 = '\u0040';   // @
        char ch4 = '\u0061';   // a

        System.out.println("-----------------------------------------------");
        System.out.println("Character\tUnicode\t\tDecimal Value");
        System.out.println("-----------------------------------------------");

        System.out.println(ch1 + "\t\t\\u0041\t\t" + (int) ch1);
        System.out.println(ch2 + "\t\t\\u0031\t\t" + (int) ch2);
        System.out.println(ch3 + "\t\t\\u0040\t\t" + (int) ch3);
        System.out.println(ch4 + "\t\t\\u0061\t\t" + (int) ch4);

        System.out.println("-----------------------------------------------");
        System.out.println("Unicode Range : \\u0000 to \\uFFFF");
        System.out.println("Decimal Range : " + (int) Character.MIN_VALUE +
                           " to " + (int) Character.MAX_VALUE);
    }
}