package UNIT3.Arrays.TwoDimensionalArray.Traversing;
//WAP in Java to print a two-dimensional array using enhanced for loop.
public class UsingEnhancedForLoop {

    public static void main(String arg[]) {

        //Declaring and initializing a two-dimensional array
        int a[][] = {{1, 2, 3}, {4, 5, 6}};

        //Using enhanced for loop to print the two-dimensional array
        for(int[] y : a){
            for(int i : y){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}