package UNIT3.Arrays.OneDimensionalArray;
//WAP in Java to pass an array as an argument to methods, display array elements and double each element.
public class PassingArrayToMethods {

    public static void main(String[] args) {

        //Declaring and initializing a one-dimensional array
        int numbers[] = {1, 2, 3, 4, 5};

        //Calling the method and passing the array as an argument
        printArray(numbers);

        //Calling the method to modify the array elements
        doubleArrayValues(numbers);

        //Displaying the modified array
        System.out.println("Array after modification:");

        //Calling the method to print the modified array
        printArray(numbers);

    }

    //Defining a method to print each element of an array
    public static void printArray(int[] arr) {

        //Using enhanced for loop to access and print each element
        for(int num : arr){
            System.out.print(num + " ");
        }

        //Moving to the next line after printing array elements
        System.out.println();
    }

    //Defining a method to double each element of an array
    public static void doubleArrayValues(int[] arr1) {

        //Using normal for loop to access and modify each element
        for(int i=0; i<arr1.length; i++){
            arr1[i] *= 2;
        }

    }

}