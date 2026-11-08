package UNIT3;
import java.util.*;

//WAP to demonstrate various methods of the Arrays class in Java.

public class MethodsOfArrayClass{

    public static void main(String arg[]){

        //Sorting an array.
        int n1[]={5,2,8,1,3};

        //Sorting the array in ascending order.
        Arrays.sort(n1);

        //Displaying the sorted array.
        System.out.println("Sorted Array: "+Arrays.toString(n1));


        //Filling an array with a specific value.
        int n2[]=new int[5];

        //Displaying the array before filling.
        System.out.println("Array: "+Arrays.toString(n2));

        //Filling the array with 10.
        Arrays.fill(n2,10);

        //Displaying the filled array.
        System.out.println("Filled Array: "+Arrays.toString(n2));


        //Filling a specific range of an array.
        int n3[]=new int[10];

        //Filling the array with 100 from index 2 to 4.
        Arrays.fill(n3,2,5,100);

        //Displaying the filled array.
        System.out.println("Filled Array: "+Arrays.toString(n3));


        //Copying and extending an array.
        int n4[]={1,2,3};

        //Copying the array into a new array of length 10.
        int copiedArray[]=Arrays.copyOf(n4,10);

        //Displaying the copied array.
        System.out.println("Copied Array: "+Arrays.toString(copiedArray));


        //Performing binary search on a sorted array.
        int index=Arrays.binarySearch(n1,8);

        //Displaying the index of the found element.
        System.out.println("Element found at index: "+index);

        //Searching for an element that is not present.
        index=Arrays.binarySearch(n1,100);

        //Displaying the search result.
        System.out.println("Element found at index: "+index);


        //Declaring and initializing a two-dimensional array.
        int numbers[][]={
            {1,2,3},
            {4,5,6}
        };

        //Displaying the two-dimensional array.
        System.out.println(Arrays.deepToString(numbers));

        //Calculating the hash code of the array.
        int result=Arrays.hashCode(numbers);

        //Displaying the hash code.
        System.out.println(result);


        //Declaring and initializing a String array.
        String arr[]={"apple","banana","cherry"};

        //Converting the array into a List.
        List<String> list=Arrays.asList(arr);

        //Displaying the List.
        System.out.println("List from Array: "+list);
    }
}

/*
Arrays.hashCode(a) considers the elements of the array,
not the array object's memory/reference.

int a[]={10,20,30};
int b[]={10,20,30};

System.out.println(a.hashCode());          
System.out.println(Arrays.hashCode(a));    
System.out.println(Arrays.hashCode(b));

System.out.println(Arrays.hashCode(a)==Arrays.hashCode(b));

//The hash codes of arrays with the same elements
//will be equal when using Arrays.hashCode().
*/