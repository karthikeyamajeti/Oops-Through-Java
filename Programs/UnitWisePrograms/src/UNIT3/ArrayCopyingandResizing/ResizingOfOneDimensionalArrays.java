package UNIT3;
//WAP to demonstrate resizing of a one-dimensional array and display the array values before and after resizing.

public class ResizingOfOneDimensionalArrays {

    //Method to print each element of an array.
    public static void print(int a[]){

        //Traversing the array using enhanced for loop.
        for(int num:a){

            //Printing each element of the array.
            System.out.print(num+"\t");
        }

        System.out.println();
    }

    public static void main(String arg[]){

        //Declaring and initializing the array.
        int a[]=new int[]{1,2,3,4,5};

        //Displaying the array values before resizing.
        System.out.println("Array values prior to resize:");

        //Calling the print method.
        print(a);

        //Resizing the array by creating a new array.
        a=new int[]{4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};

        //Displaying the array values after resizing.
        System.out.println("Array values after resize:");

        //Calling the print method.
        print(a);
    }
}