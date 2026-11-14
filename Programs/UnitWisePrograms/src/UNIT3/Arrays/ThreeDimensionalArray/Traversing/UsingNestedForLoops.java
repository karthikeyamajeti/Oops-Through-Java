package UNIT3.Arrays.ThreeDimensionalArray.Traversing;
//WAP in Java to declare, initialize and print the elements of a three-dimensional array using nested for loops.
public class UsingNestedForLoops {

    public static void main(String[] args) {

        //Declaring and allocating memory for a three-dimensional array of size 2x3x4
        int[][][] array3D = new int[2][3][4];

        //Initializing the three-dimensional array with values
        int value = 1;

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<4; k++){
                    array3D[i][j][k] = value++;
                }
            }
        }

        //Displaying the three-dimensional array elements
        System.out.println("3D Array");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<4; k++){
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}