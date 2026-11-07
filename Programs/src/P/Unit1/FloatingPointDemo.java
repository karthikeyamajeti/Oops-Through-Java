package P.Unit1;
public class FloatingPointDemo {

    public static void main(String[] args) {

        // Float (Single Precision - 4 bytes)
        float f = 3.1415927f;

        // Double (Double Precision - 8 bytes)
        double d = 3.141592653589793;

        System.out.println("===== FLOAT =====");
        System.out.println("Value        : " + f);
        System.out.println("Size         : " + Float.BYTES + " bytes");
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);

        System.out.println();

        System.out.println("===== DOUBLE =====");
        System.out.println("Value        : " + d);
        System.out.println("Size         : " + Double.BYTES + " bytes");
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Maximum Value: " + Double.MAX_VALUE);

        System.out.println();

        System.out.println("===== PRECISION COMPARISON =====");
        System.out.println("Float  : " + f);
        System.out.println("Double : " + d);
    }
}