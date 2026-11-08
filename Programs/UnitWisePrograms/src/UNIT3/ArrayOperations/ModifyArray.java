package UNIT3;
//WAP to pass an array to a method, modify the array elements by doubling their values, and display the modified array.
public class ModifyArray{

    public static void main(String arg[]){

        //Declaring and initializing the array.
        int numbers[]={1,2,3,4,5};

        //Calling the method and passing the array as an argument.
        printArray(numbers);

        //Modifying the array elements in another method.
        doubleArrayValues(numbers);

        //Displaying the modified array.
        System.out.println("Array after modification:");

        //Calling the method to display the modified array.
        printArray(numbers);
    }

    //Method to print each element of an array.
    public static void printArray(int arr[]){

        //Traversing the array using enhanced for loop.
        for(int num:arr){

            //Printing each element of the array.
            System.out.print(num+"\t");
        }

        System.out.println();
    }

    //Method to double each element in an array.
    public static void doubleArrayValues(int arr1[]){

        //Traversing the array using for loop.
        for(int i=0;i<arr1.length;i++){

            //Doubling the value of each element.
            arr1[i]*=2;
        }
    }
}