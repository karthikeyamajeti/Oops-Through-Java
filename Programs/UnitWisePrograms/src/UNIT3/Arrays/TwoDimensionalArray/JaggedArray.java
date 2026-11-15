package UNIT3.Arrays.TwoDimensionalArray;
//WAP in Java to declare, initialize and display a jagged array.
public class JaggedArray {

    public static void main(String[] args) {

        //Declaring and allocating memory for a jagged array with 3 rows
        int[][] ja = new int[3][];

        //Initializing each row with different number of columns
        ja[0] = new int[]{1, 2};
        ja[1] = new int[]{1, 2, 3, 4};
        ja[2] = new int[]{1, 2, 3};

        //Displaying the jagged array
        System.out.println("Jagged Array:");

        //Outer loop to access each row
        for(int i=0; i<ja.length; i++){

            //Inner loop to access each element in each row
            for(int j=0; j<ja[i].length; j++){
                System.out.print(ja[i][j] + " ");
            }

            //Moving to the next line after printing each row
            System.out.println();
        }

    }
}