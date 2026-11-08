package UNIT3;
//WAP to demonstrate reference assignment of one-dimensional arrays and display the changes made to both arrays.
public class ReferenceAssignmentOfOneDimensionalArrays{

    public static void main(String arg[]){

        //Declaring and initializing the first array.
        int array1[]={1,2,3,4,5};

        //Assigning array1 to array2 (reference assignment).
        int array2[]=array1;

        //Modifying the first element using array2.
        array2[0]=10;

        //Modifying the third element using array1.
        array1[2]=2000;

        //Displaying the elements of array1.
        print(array1);

        //Displaying the elements of array2.
        print(array2);
    }

    //Method to print each element of an array.
    static void print(int a[]){

        //Traversing the array using enhanced for loop.
        for(int num:a){

            //Printing each element of the array.
            System.out.print(num+"\t");
        }

        System.out.println();
    }
}