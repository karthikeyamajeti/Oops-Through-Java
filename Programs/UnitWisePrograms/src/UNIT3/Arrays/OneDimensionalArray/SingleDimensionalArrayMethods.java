package UNIT3.Arrays.OneDimensionalArray;
//WAP in Java to demonstrate various predefined methods of the Arrays class using a single-dimensional array.
import java.util.*;
public class SingleDimensionalArrayMethods {

    public static void main(String[] args) {

        //Sorting an array using Arrays.sort()
        int n1[] = {5, 2, 8, 1, 3};

        //Sorting the array in ascending order
        Arrays.sort(n1);

        //Displaying the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(n1));


        //Declaring and initializing an array with default values
        int n2[] = new int[5];

        //Displaying the original array
        System.out.println("Array: " + Arrays.toString(n2));

        //Filling the entire array with 10 using Arrays.fill()
        Arrays.fill(n2, 10);

        //Displaying the filled array
        System.out.println("Filled Array: " + Arrays.toString(n2));


        //Declaring and allocating memory for an array
        int n3[] = new int[10];

        //Filling array elements with 100 from index 2 to 4
        Arrays.fill(n3, 2, 5, 100);

        //Displaying the filled array
        System.out.println("Filled Array: " + Arrays.toString(n3));


        //Declaring and initializing an array
        int n4[] = {1, 2, 3};

        //Copying the array and extending its size to 10 elements
        int copiedArray[] = Arrays.copyOf(n4, 10);

        //Displaying the copied array
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));


        //Searching for an element in the sorted array using Arrays.binarySearch()
        int index = Arrays.binarySearch(n1, 8);

        //Displaying the index of the searched element
        System.out.println("Element found at index: " + index);

        //Searching for an element that is not present in the array
        index = Arrays.binarySearch(n1, 100);

        //Displaying the search result
        System.out.println("Element found at index: " + index);


        //Declaring and initializing a String array
        String arr[] = {"apple", "banana", "cherry"};

        //Converting the array into a List using Arrays.asList()
        List<String> list = Arrays.asList(arr);

        //Displaying the list
        System.out.println("List from Array: " + list);


        //Declaring and initializing two arrays
        int a[] = {10, 20, 30};
        int b[] = {10, 20, 30};

        //Calculating hash codes using Arrays.hashCode()
        System.out.println(Arrays.hashCode(a));
        System.out.println(Arrays.hashCode(b));

        //Comparing the hash codes of both arrays
        System.out.println(Arrays.hashCode(a) == Arrays.hashCode(b));

    }
}