package UNIT3;
//WAP to demonstrate different ways of traversing and displaying elements of a two-dimensional array.
public class TraversingTwoDimensionalArray {

    public static void main(String arg[]) {

        //Declaring and initializing a two-dimensional array.
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        //Displaying using Normal For loop
        System.out.println("Traversing Using Normal for loops");
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        /*
        a.length gives the number of rows.
        a[i].length gives the number of columns in row i.
        a[i][j] gives the element at row i and column j.
        */
        
        //Displaying array elements using for loops with length property.
        System.out.println("Traversing using for loops with length property");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //Displaying array elements using enhanced for loop.
        System.out.println("Traversing Using Enhanced For loop");
        for (int[] y : a){
            for (int i : y){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}