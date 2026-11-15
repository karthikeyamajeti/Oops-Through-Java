package UNIT0;
//WAP to perform a binary search on a sorted array of integers
import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array
        int n = sc.nextInt();

        // Declaring an array and reading its elements
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        // Reading the element to be searched
        int key = sc.nextInt();

        // Initializing low to the first index and high to the last index
        int low = 0, high = n - 1;

        // Variable to check whether the key is found
        boolean found = false;

        // Variable to store the index of the key
        int pos = 0;

        // Repeating the search until the search range becomes empty
        while(low <= high){

            // Calculating the middle index
            int mid = low+(high-low)/2;

            // Checking whether the middle element matches the key
            if(key == a[mid]){
                found = true;
                pos = mid;
                break; // Exiting the loop when the key is found
            }

            // If key is smaller, search in the left half
            else if(key < a[mid]){
                high = mid-1;
            }

            // If key is greater, search in the right half
            else {
                low = mid+1;
            }
        }

        // Displaying the search result
        if(found){
            System.out.println("Found at " + pos);
        }else{
            System.out.println("Not found");
        }
        
    }
}