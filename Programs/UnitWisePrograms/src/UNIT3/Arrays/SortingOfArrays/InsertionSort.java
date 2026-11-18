package UNIT3.Arrays.SortingOfArrays;
//WAP in Java to implement insertion sort and display the sorted array.
import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        //Creating a Scanner object to accept input
        Scanner sc = new Scanner(System.in);

        //Reading the size of the array
        int n = sc.nextInt();

        //Declaring an array of size n
        int a[] = new int[n];

        //Accepting array elements
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        //Performing insertion sort
        for(int k = 1; k < n; k++) {
            
            //Storing the current element
            int temp=a[k];
            int j = k-1;

            //Shifting elements greater than temp to the right
            while(j>=0 && a[j]>temp) {
                a[j+1] = a[j];
                j--;
            }

            //Inserting temp into its correct position
            a[j+1] = temp;
        }

        //Displaying the sorted array
        for(int h=0; h<n; h++) {
            System.out.print(a[h] + " ");
        }
    }
}