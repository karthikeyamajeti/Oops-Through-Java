package UNIT3;
//WAP to demonstrate different ways of traversing and displaying elements of a one-dimensional array.
public class TraversingOneDimensionalArray{

    public static void main(String arg[]) {

        //Declaring and initializing a one-dimensional array.
        int a[] = {1, 2, 3, 4, 5};

        //Printing each element using its index.
        System.out.println("Displaying array elements using normal for loop");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        
        System.out.println();
        
        //Printing each element of the array.
        System.out.println("Displaying array elements using enhanced for loop");
        for (int x : a){
            System.out.print(x+"\t");
        }
        
    }
}