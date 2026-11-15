package UNIT0;
/*
WAP to sort an array of integers using Bubble Sort algorithm.
Read the number of elements and array elements from the user,
then display the sorted array in ascending order.
*/
import java.util.*;

public class Bubblesort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array:");
        // Reading the size of the array
        int n = sc.nextInt();
        
        // Reading elements in the array
        System.out.println("Enter elements in the array");
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        // Performing Bubble Sort using adjacent element comparisons
        for(int i=0; i<n-1; i++){
            // Comparing adjacent elements in each pass
            for(int j=0; j<n-i-1; j++){
                // Swapping elements if they are in the wrong order
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        // Displaying the sorted array in ascending order
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

    }
}