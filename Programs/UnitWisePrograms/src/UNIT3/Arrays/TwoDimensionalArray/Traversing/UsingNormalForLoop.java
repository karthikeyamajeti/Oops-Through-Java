package UNIT3.Arrays.TwoDimensionalArray.Traversing;
//WAP in Java to print a two-dimensional array using normal for loop.
public class UsingNormalForLoop{

    public static void main(String arg[]) {

        //Declaring and initializing a two-dimensional array
        int a[][] = {{1, 2, 3}, {4, 5, 6}};

        //Using normal for loop to print the two-dimensional array
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}