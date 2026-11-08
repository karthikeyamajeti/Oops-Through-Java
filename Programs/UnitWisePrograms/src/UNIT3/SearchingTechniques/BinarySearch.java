package UNIT3;
//WAP to implement Binary Search to find an element in a sorted one-dimensional array.

public class BinarySearch{

    //Method to perform binary search.
    int binarySearch(int a[],int x){

        //Initializing the left and right pointers.
        int l=0;
        int r=a.length-1;

        //Repeating the search while l is less than or equal to r.
        while(l<=r){

            //Finding the middle index.
            int m=(l+r)/2;

            //Checking whether the middle element is equal to the search element.
            if(a[m]==x){

                //Returning the index of the element.
                return m;

            //If the element is smaller than the middle element.
            //Searching in the left subarray.
            }else if(a[m]>x){

                //Decreasing the right pointer.
                r=m-1;

            //If the element is greater than the middle element.
            //Searching in the right subarray.
            }else{

                //Increasing the left pointer.
                l=m+1;
            }
        }

        //Returning -1 if the element is not found.
        return -1;
    }

    public static void main(String arg[]){

        //Creating an object of the BinarySearch class.
        BinarySearch ob=new BinarySearch();

        //Declaring and initializing the sorted array.
        int a[]={2,3,4,10,40};

        //Finding the length of the array.
        int n=a.length;

        //Declaring the element to be searched.
        int x=10;

        //Calling the binarySearch method.
        int res=ob.binarySearch(a,x);

        //Checking whether the element is present or not.
        if(res==-1){

            //Displaying the message if the element is not found.
            System.out.println("Element not present");

        }else{

            //Displaying the index of the found element.
            System.out.println("Element found at index "+res);
        }
    }
}