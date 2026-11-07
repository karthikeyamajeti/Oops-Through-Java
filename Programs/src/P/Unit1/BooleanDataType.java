package P.Unit1;
public class BooleanDataType {

    public static void main(String[] args) {

        // Boolean variables
        boolean isJavaEasy = true;
        boolean isFishFlying = false;

        System.out.println("===== BOOLEAN VALUES =====");
        System.out.println("Is Java Easy?      : " + isJavaEasy);
        System.out.println("Is Fish Flying?    : " + isFishFlying);

        // Boolean using relational operators
        int a = 10;
        int b = 20;

        System.out.println("\n===== RELATIONAL OPERATORS =====");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Boolean in an if statement
        System.out.println("\n===== IF STATEMENT =====");

        boolean isPassed = true;

        if (isPassed) {
            System.out.println("Congratulations! You Passed.");
        } else {
            System.out.println("Better Luck Next Time.");
        }
    }
}