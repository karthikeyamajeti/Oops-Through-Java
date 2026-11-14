package UNIT3.Arrays.TwoDimensionalArray.Traversing;
//WAP in Java to print a two-dimensional array using array length.
public class UsingArrayLength {

    public static void main(String arg[]) {

        //Declaring and initiwalizing a two-dimensional array
        int a[][] = {{1, 2, 3}, {4, 5, 6}};

        /*
            a.length      -> Number of rows = 2
            a[i].length   -> Number of columns in row i
            a[i][j]       -> Element at row i, column j
        */

        //Using array length to print the two-dimensional array
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}