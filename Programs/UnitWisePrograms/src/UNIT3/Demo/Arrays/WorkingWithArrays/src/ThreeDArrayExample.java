import java.util.*;
class ThreeDArrayExample {
    public static void main(String[] args) {
        // Define a 3D array with dimensions 2x3x4
        int[][][] array3D = new int[2][3][4];
 
        // Populate the 3D array with values
        int value = 1;
        for (int i = 0; i < 2; i++) {           // First dimension
            for (int j = 0; j < 3; j++) {     // Second dimension
                for (int k = 0; k < 4; k++) { // Third dimension
                    array3D[i][j][k] = value++;
                }
            }
        }
		 // Print the 3D array elements
        System.out.println("3D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Newline for each 2D layer
            }
            System.out.println(); // Blank line between layers
        } 
    }
}