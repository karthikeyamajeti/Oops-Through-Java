import java.util.*;
class ArrayEx8 {
    public static void main(String[] args) {
        /*Sort*/
		int[] n1 = {5, 2, 8, 1, 3};
        Arrays.sort(n1);
        System.out.println("Sorted Array: " + Arrays.toString(n1));

		int[] n2 = new int[5];
        System.out.println("  Array: " + Arrays.toString(n2));
		Arrays.fill(n2, 10);  // Fill the array with 10
        System.out.println("Filled Array: " + Arrays.toString(n2));
		
		int[] n3 = new int[10];
        Arrays.fill(n3,2,5, 100);  // Fill the array with 100 from index 2 -4
        System.out.println("Filled Array: " + Arrays.toString(n3));
			
		int[] n4 = {1, 2, 3};
        int[] copiedArray = Arrays.copyOf(n4,10);  // Copy and extend the array
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
		
		int index = Arrays.binarySearch(n1, 8);
        System.out.println("Element found at index: " + index);
		index = Arrays.binarySearch(n1, 100);
        System.out.println("Element found at index: " + index);
	 
        int[][] numbers = {
        	    {1, 2, 3},
        	    {4, 5, 6}
        	};

       System.out.println(Arrays.deepToString(numbers));
       int result = Arrays.hashCode(numbers);
       System.out.println(result);
		 
	   String[] arr = {"apple", "banana", "cherry"};
       List<String> list = Arrays.asList(arr);
       System.out.println("List from Array: " + list); 
    }
}
/*

//Arrays.hashCode(a) considers the elements of the array, not the array object's memory/reference.

/* 
int[] a = {10, 20, 30};
int[] b = {10, 20, 30};

System.out.println(a.hashCode());          // different values possible
System.out.println(Arrays.hashCode(a));    // same as Arrays.hashCode(b)

System.out.println(Arrays.hashCode(a) == Arrays.hashCode(b)); // true
*/ 