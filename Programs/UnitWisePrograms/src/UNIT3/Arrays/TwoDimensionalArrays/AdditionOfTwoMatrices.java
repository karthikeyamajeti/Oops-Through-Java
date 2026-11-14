package UNIT3.Arrays;
//WAP in Java to perform addition of two matrices & display resultant matrix
import java.util.Scanner;
public class AdditionOfTwoMatrices {

    public static void main(String[] args) {

        //Declaring variables to store rows and columns of both matrices
        int r1, c1, r2, c2;

        Scanner sc = new Scanner(System.in);

        //Reading number of rows, columns the first matrix
        System.out.print("Enter number of rows in first matrix:");
        r1 = sc.nextInt();

        System.out.print("Enter number of columns in first matrix:");
        c1 = sc.nextInt();

        //Reading number of rows, columns the second matrix
        System.out.print("Enter number of rows in second matrix:");
        r2 = sc.nextInt();

        System.out.print("Enter number of columns in second matrix:");
        c2 = sc.nextInt();

        //Checking whether both matrices have same dimensions
        if(r1 == r2 && c1 == c2){

            //Declaring and memory allocating for 3 Two Dimensional Arrays
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r1][c1];

            //Accepting all elements of the first matrix
            System.out.println("Enter all the elements of first matrix:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    a[i][j] = sc.nextInt();
                }
                
            }

            //Accepting all elements of the second matrix
            System.out.println("Enter all the elements of second matrix:");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    b[i][j] = sc.nextInt();
                }
            }

            //Performing addition to two matrices
            for(int i=0; i<r1; i++){
                for (int j=0; j<c1; j++){
                    c[i][j] = a[i][j]+b[i][j];
                }
            }

            //Displying resultant matrix
            System.out.println("Matrix after addition");
            for(int i=0; i<r1; i++){
                for (int j=0; j<c1; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            //Displaying message if matrix addition is not possible
            System.out.println("Addition would not be possible");
        }
        
    }
}