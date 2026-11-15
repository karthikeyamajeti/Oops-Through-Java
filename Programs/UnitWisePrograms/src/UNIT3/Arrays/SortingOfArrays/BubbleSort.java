package UNIT3.Arrays.SortingOfArrays;
//WAP in Java to implement bubble sort and display the sorted array.
import java.util.Arrays;

public class BubbleSort {

    //Defining a method to perform bubble sort
    static void bubbleSort(int[] arr) {

        //Calculating the length of the array
        int n = arr.length;

        //Repeating the passes to sort the array
        for(int i=0; i<n; i++) {

            //Comparing adjacent elements
            for(int j=0; j<n-1; j++) {

                //Checking whether the current element is greater than the next element
                if(arr[j] > arr[j+1]) {

                    //Swapping the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        //Declaring and initializing an array
        int[] arr = {64, 25, 12, 22, 11};

        //Displaying the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        //Calling the bubbleSort() method
        bubbleSort(arr);

        //Displaying the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}