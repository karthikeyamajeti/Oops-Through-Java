package UNIT3.Arrays.SortingOfArrays;
//WAP in Java to implement selection sort and display the sorted array.
import java.util.Arrays;

public class SelectionSort {

    //Defining a method to perform selection sort
    static void selectionSort(int[] arr) {

        //Calculating the length of the array
        int n = arr.length;

        //Repeating the passes to sort the array
        for(int i=0; i<n-1; i++) {

            //Assuming the current position holds the minimum element
            int min_idx = i;

            //Searching for the minimum element in the unsorted portion
            for(int j=i+1; j<n; j++) {

                //Checking whether a smaller element is found
                if(arr[j] < arr[min_idx]) {

                    //Updating the index of the minimum element
                    min_idx = j;
                }
            }

            //Swapping the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
    }

    public static void main(String[] args) {

        //Declaring and initializing an array
        int[] arr = {64, 25, 12, 22, 11};

        //Displaying the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        //Calling the selectionSort() method
        selectionSort(arr);

        //Displaying the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}