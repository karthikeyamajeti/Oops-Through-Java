package UNIT3;
//WAP to perform addition of two one-dimensional arrays and display the resultant array.

public class AdditionOfOneDimensionalArrays{

    public static void main(String arg[]){

        //Declaring and initializing the first array.
        int array1[]={1,2,3};

        //Declaring and initializing the second array.
        int array2[]={4,5,6};

        //Declaring the resultant array.
        int sumArray[]=new int[array1.length];

        //Adding corresponding elements of both arrays.
        for(int i=0;i<array1.length;i++){
            sumArray[i]=array1[i]+array2[i];
        }

        //Displaying the resultant array.
        System.out.println("Sum of arrays:");

        //Traversing the resultant array using enhanced for loop.
        for(int num:sumArray){

            //Printing each element of the resultant array.
            System.out.print(num+"\t");
        }
    }
}
