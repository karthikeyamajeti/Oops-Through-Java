package UNIT3;
import java.util.Arrays;
//WAP to implement Selection Sort to sort the elements of a one-dimensional array in ascending order.

public class Selection_Sort{

    //Method to perform Selection Sort.
    static void selectionSort(int arr[]){

        //Finding the length of the array.
        int n=arr.length;

        //Outer loop to traverse the unsorted array.
        for(int i=0;i<n-1;i++){

            //Assuming the current position holds the minimum element.
            int min_idx=i;

            //Traversing the unsorted portion to find the minimum element.
            for(int j=i+1;j<n;j++){

                //Checking whether a smaller element is found.
                if(arr[j]<arr[min_idx]){

                    //Updating the minimum index.
                    min_idx=j;
                }
            }

            //Moving the minimum element to its correct position.
            int temp=arr[i];

            arr[i]=arr[min_idx];

            arr[min_idx]=temp;
        }
    }

    public static void main(String arg[]){

        //Declaring and initializing the array.
        int arr[]={64,25,12,22,11};

        //Displaying the original array.
        System.out.println("Original array: "+Arrays.toString(arr));

        //Calling the selectionSort method.
        selectionSort(arr);

        //Displaying the sorted array.
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}