package UNIT1.DataTypes;
//WAP in Java to demonstrate float and double data types and compare their precision, size, minimum and maximum values.

public class FloatingPointDemo {
    
    public static void main(String[] args) {
        
        //Declaring and initializing a float variable (Single Precision - 4 bytes)
        float f = 3.1415927f;

        //Declaring and initializing a double variable (Double Precision - 8 bytes)
        double d = 3.141592653589793;

        //Displaying float details
        System.out.println("===== FLOAT =====");
        System.out.println("Value        : " + f);
        System.out.println("Size         : " + Float.BYTES + " bytes");
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);

        System.out.println();

        //Displaying double details
        System.out.println("===== DOUBLE =====");
        System.out.println("Value        : " + d);
        System.out.println("Size         : " + Double.BYTES + " bytes");
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Maximum Value: " + Double.MAX_VALUE);

        System.out.println();

        //Comparing float and double precision
        System.out.println("===== PRECISION COMPARISON =====");
        System.out.println("Float  : " + f);
        System.out.println("Double : " + d);
    }
}