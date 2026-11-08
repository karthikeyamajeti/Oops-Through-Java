package UNIT3;
import java.util.Arrays;
//WAP to implement Bubble Sort to sort the elements of a one-dimensional array in ascending order.

public class Bubble_Sort{

    //Method to perform Bubble Sort.
    static void bubbleSort(int arr[]){

        //Finding the length of the array.
        int n=arr.length;

        //Outer loop to perform the number of passes.
        for(int i=0;i<n;i++){

            //Inner loop to compare adjacent elements.
            for(int j=0;j<n-1;j++){

                //Checking whether the current element is greater than the next element.
                if(arr[j]>arr[j+1]){

                    //Swapping the elements.
                    int temp=arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String arg[]){

        //Declaring and initializing the array.
        int arr[]={64,25,12,22,11};

        //Displaying the original array.
        System.out.println("Original array: "+Arrays.toString(arr));

        //Calling the bubbleSort method.
        bubbleSort(arr);

        //Displaying the sorted array.
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}