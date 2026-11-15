package UNIT3.Arrays.OneDimensionalArray;
//WAP in Java to demonstrate reference assignment of arrays and display the changes made through both reference variables.
public class ArrayReferenceAssignment {

    public static void main(String[] args) {

        //Declaring and initializing the first array
        int array1[] = {1, 2, 3, 4, 5};

        //Assigning array1 reference to array2
        //Both reference variables pointing to the same array object
        int array2[] = array1;

        //Modifying the first element using array2
        array2[0] = 10;

        //Modifying the third element using array1
        array1[2] = 2000;

        //Calling the print method to display both arrays
        print(array1);
        print(array2);

    }

    //Defining a method to print the elements of an array
    static void print(int[] a) {

        //Using enhanced for loop to access and print each element
        for(int num : a){
            System.out.print(num + " ");
        }

        //Moving to the next line after printing array elements
        System.out.print("\n");
    }

}