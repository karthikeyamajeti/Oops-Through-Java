package UNIT3;
//WAP to demonstrate a three-dimensional array, initialize its elements, and display the array elements.

public class ThreeDArrayExample{

    public static void main(String arg[]){

        //Declaring a three-dimensional array with dimensions 2x3x4.
        int array3D[][][]=new int[2][3][4];

        //Initializing the value variable.
        int value=1;

        //Populating the three-dimensional array with values.
        for(int i=0;i<2;i++){

            //Traversing the second dimension.
            for(int j=0;j<3;j++){

                //Traversing the third dimension.
                for(int k=0;k<4;k++){

                    //Assigning values to the array elements.
                    array3D[i][j][k]=value++;
                }
            }
        }

        //Displaying the three-dimensional array elements.
        System.out.println("3D Array:");

        //Traversing the three-dimensional array using nested for loops.
        for(int i=0;i<2;i++){

            //Traversing each row.
            for(int j=0;j<3;j++){

                //Traversing each column.
                for(int k=0;k<4;k++){

                    //Printing each element of the array.
                    System.out.print(array3D[i][j][k]+"\t");
                }

                //Moving to the next line after each row.
                System.out.println();
            }

            //Printing a blank line between two layers.
            System.out.println();
        }
    }
}