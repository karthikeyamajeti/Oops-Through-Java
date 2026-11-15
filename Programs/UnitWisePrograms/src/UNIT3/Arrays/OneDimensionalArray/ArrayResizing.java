package UNIT3.Arrays.OneDimensionalArray;
//WAP in Java to demonstrate resizing an array by creating a new array and displaying the array elements before and after resizing.
public class ArrayResizing {

    //Defining a method to print the elements of an array
    public static void print(int[] a){

        //Using enhanced for loop to access and print each element
        for(int num : a){
            System.out.print(num + " ");
        }

        //Moving to the next line after printing array elements
        System.out.println();
    }

    public static void main(String[] args) {

        //Declaring and initializing an array with 5 elements
        int[] a = new int[]{1, 2, 3, 4, 5};

        //Displaying array elements before resizing
        System.out.println("Array values prior to resize: ");

        //Calling the print method to display the original array
        print(a);

        //Creating a new array with 15 elements and assigning it to the existing reference variable
        a = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};

        //Displaying array elements after resizing
        System.out.println("Array values after resize: ");

        //Calling the print method to display the resized array
        print(a);

    }
}