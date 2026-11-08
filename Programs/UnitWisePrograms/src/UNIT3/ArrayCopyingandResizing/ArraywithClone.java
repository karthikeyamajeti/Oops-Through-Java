package UNIT3;
//WAP to demonstrate cloning of a two-dimensional array to maintain a separate copy of another object.

public class ArraywithClone{

    public static void main(String arg[]){

        //Declaring and initializing the two-dimensional array.
        int a[][]={
            {10,20},
            {30,40}
        };

        //Declaring the second two-dimensional array.
        int b[][]=new int[a.length][];

        //Copying each row of array a into array b using clone().
        for(int i=0;i<a.length;i++){

            //Creating a separate copy of each row.
            b[i]=a[i].clone();
        }

        //Modifying the first element of array b.
        b[0][0]=100;

        //Displaying the first element of array a.
        System.out.println("a[0][0] = "+a[0][0]);

        //Displaying the first element of array b.
        System.out.println("b[0][0] = "+b[0][0]);
    }
}