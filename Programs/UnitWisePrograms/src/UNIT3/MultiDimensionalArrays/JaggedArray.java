package UNIT3;
//WAP to demonstrate a jagged array with different numbers of columns in each row and display its elements.

public class JaggedArray{

    public static void main(String arg[]){

        //Declaring a jagged array with 3 rows.
        int ja[][]=new int[3][];

        //Initializing the first row with 2 columns.
        ja[0]=new int[]{1,2};

        //Initializing the second row with 4 columns.
        ja[1]=new int[]{1,2,3,4};

        //Initializing the third row with 3 columns.
        ja[2]=new int[]{1,2,3};

        //Displaying the jagged array.
        System.out.println("Jagged Array:");

        //Traversing the jagged array using nested for loops.
        for(int i=0;i<ja.length;i++){

            //Traversing each row.
            for(int j=0;j<ja[i].length;j++){

                //Printing each element of the jagged array.
                System.out.print(ja[i][j]+"\t");
            }

            System.out.println();
        }
    }
}