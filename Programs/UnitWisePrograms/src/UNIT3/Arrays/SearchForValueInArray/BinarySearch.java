package UNIT3.Arrays.SearchForValueInArray;
//WAP in Java to implement binary search and display the index of the searched element.
public class BinarySearch {

    //Defining a method to perform binary search
    int binarySearch(int a[], int x) {

        //Initializing the left and right pointers
        int l = 0;
        int r = a.length - 1;

        //Repeating the search until the left pointer is less than or equal to the right pointer
        while(l <= r) {

            //Calculating the middle index
            int m = (l + r) / 2;

            //Checking whether the middle element is equal to the search element
            if(a[m] == x) {
                return m;

            //Checking whether the search element is smaller than the middle element
            } else if(a[m] > x) {

                //Moving the right pointer to the left half
                r = m - 1;

            //Searching in the right half if the element is greater than the middle element
            } else {

                //Moving the left pointer to the right half
                l = m + 1;
            }
        }

        //Returning -1 if the element is not found
        return -1;
    }

    public static void main(String args[]) {

        //Creating an object of BinarySearch class
        BinarySearch ob = new BinarySearch();

        //Declaring and initializing a sorted array
        int a[] = {2, 3, 4, 10, 40};

        //Calculating the length of the array
        int n = a.length;

        //Declaring the element to be searched
        int x = 10;

        //Calling the binarySearch() method
        int res = ob.binarySearch(a, x);

        //Checking whether the element is found
        if(res == -1) {

            //Displaying a message if the element is not found
            System.out.println("Element not present");

        } else {

            //Displaying the index of the searched element
            System.out.println("Element found at index " + res);
        }

    }
}