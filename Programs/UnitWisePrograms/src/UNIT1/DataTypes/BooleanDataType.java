package UNIT1.DataTypes;
//WAP in Java to demonstrate the Boolean data type and its use with relational operators and if-else statements.

public class BooleanDataType {
    
    public static void main(String[] args) {
        
        //Declaring and initializing boolean variables
        boolean isJavaEasy = true;
        boolean isFishFlying = false;

        //Displaying boolean values
        System.out.println("===== BOOLEAN VALUES =====");
        System.out.println("Is Java Easy?      : " + isJavaEasy);
        System.out.println("Is Fish Flying?    : " + isFishFlying);

        //Declaring and initializing integer variables
        int a = 10;
        int b = 20;

        //Demonstrating boolean results using relational operators
        System.out.println("\n===== RELATIONAL OPERATORS =====");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        //Demonstrating boolean values in an if-else statement
        System.out.println("\n===== IF STATEMENT =====");

        boolean isPassed = true;

        if (isPassed) {
            System.out.println("Congratulations! You Passed.");
        } else {
            System.out.println("Better Luck Next Time.");
        }
    }
}