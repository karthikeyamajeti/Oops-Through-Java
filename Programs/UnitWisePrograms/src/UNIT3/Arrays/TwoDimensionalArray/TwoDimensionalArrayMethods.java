package UNIT3.Arrays.TwoDimensionalArray;
//WAP in Java to demonstrate predefined methods of the Arrays class using a two-dimensional array.
import java.util.*;
public class TwoDimensionalArrayMethods {

    public static void main(String[] args) {

        //Declaring and initializing a two-dimensional array
        int numbers[][] = {
                            {1, 2, 3},
                            {4, 5, 6}
                          };

        //Displaying the two-dimensional array using Arrays.deepToString()
        System.out.println("Two-Dimensional Array: " + Arrays.deepToString(numbers));


        //Calculating the hash code of the array using Arrays.hashCode()
        int result = Arrays.hashCode(numbers);

        //Displaying the calculated hash code
        System.out.println("Hash Code: " + result);


        //Calculating the deep hash code of the array using Arrays.deepHashCode()
        int deepResult = Arrays.deepHashCode(numbers);

        //Displaying the calculated deep hash code
        System.out.println("Deep Hash Code: " + deepResult);

    }
}