package UNIT3.Arrays.OneDimensionalArray.Traversing;
//WAP in Java to print the elements of a one-dimensional array using enhanced for loop.
public class UsingEnhancedForLoop {

    public static void main(String arg[]) {

        //Declaring and initializing a one-dimensional array
        int a[] = {1, 2, 3, 4, 5};

        //Accessing each element directly without using index
        for(int x : a){
            System.out.println(" " + x);
        }

    }
}