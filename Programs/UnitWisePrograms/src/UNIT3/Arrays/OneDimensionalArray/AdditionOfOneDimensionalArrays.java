package UNIT3.Arrays.OneDimensionalArray;
//WAP in Java to perform addition of two one-dimensional arrays and display the resultant array.
public class AdditionOfOneDimensionalArrays {

    public static void main(String[] args) {

        //Declaring and initializing two one-dimensional arrays
        int array1[] = {1, 2, 3};
        int array2[] = {4, 5, 6};

        //Declaring and allocating memory for the resultant array
        int sumArray[] = new int[array1.length];

        //Adding corresponding elements of both arrays
        //Accessing each element using index
        for(int i=0; i<array1.length; i++){
            sumArray[i] = array1[i] + array2[i];
        }

        //Displaying the resultant array
        System.out.println("Sum of arrays");

        //Using enhanced for loop to print the resultant array
        for(int num : sumArray){
            System.out.print(num + " ");
        }

    }
}