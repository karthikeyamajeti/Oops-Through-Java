package UNIT3.Arrays.TwoDimensionalArray;
//WAP in Java to demonstrate cloning of a two-dimensional array and maintaining a separate copy.
public class ArraywithClone {

    public static void main(String[] args) {

        //Declaring and initializing a two-dimensional array
        int[][] a = {
                        {10, 20},
                        {30, 40}
                    };

        //Declaring and allocating memory for another two-dimensional array
        int[][] b = new int[a.length][];

        //Copying each row of the original array using clone()
        for(int i=0; i<a.length; i++){
            b[i] = a[i].clone();
        }

        //Modifying an element in the cloned array
        b[0][0] = 100;

        //Displaying the first element of the original array
        System.out.println("a[0][0] = " + a[0][0]);

        //Displaying the first element of the cloned array
        System.out.println("b[0][0] = " + b[0][0]);

    }
}