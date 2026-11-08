package UNIT3;
//WAP to perform addition of two matrices.
import java.util.Scanner; 
public class MatrixAddition { 
    
    public static void main(String[] args) {
        
        //Declaring variables to store rows and columns of both matrices.
        int r1, c1, r2, c2; 

        //Creating Scanner object for taking input.
        Scanner sc = new Scanner(System.in); 

        //Reading the number of rows in the first matrix.
        System.out.print("Enter number of rows in first matrix: ");
        r1 = sc.nextInt(); 

        //Reading the number of columns in the first matrix.
        System.out.print("Enter number of columns in first matrix: ");
        c1 = sc.nextInt(); 

        //Reading the number of rows in the second matrix.
        System.out.print("Enter number of rows in second matrix: ");
        r2 = sc.nextInt(); 

        //Reading the number of columns in the second matrix.
        System.out.print("Enter number of columns in second matrix: ");
        c2 = sc.nextInt(); 

        //Matrix addition is possible only when both matrices have the same dimensions.
        if(r1 == r2 && c1 == c2){

            //Declaring the first matrix.
            int a[][] = new int[r1][c1];
            
            //Declaring the Second matrix.
            int b[][] = new int[r2][c2]; 
            
            //Declaring the Third matrix.
            int c[][] = new int[r1][c1];

            System.out.println("Enter all the elements of first matrix");

            // Reads the elements of the first matrix.
            for (int i=0; i<r1; i++){
                for (int j=0; j<c1; j++){
                    a[i][j] = sc.nextInt(); 
                }
            }

            System.out.println("Enter all the elements of second matrix:");

            // Reads the elements of the second matrix.
            for (int i=0; i <r2; i++) {
                for (int j=0; j<c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            // Adds the corresponding elements of both matrices.
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    c[i][j] = a[i][j] + b[i][j]; // Stores the sum in the resultant matrix.
                }
            }

            System.out.println("Matrix after addition:");

            //Displaying the resultant matrix.
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(c[i][j] + " "); 
                }
                System.out.println();
            }

        } else {
            // Displays a message if matrix dimensions are not equal.
            System.out.println("Matrix addition is not possible.");
        }

    }
}