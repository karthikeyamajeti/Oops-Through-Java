package UNIT3;
//WAP to declare, initialize and display the elements of a string array using for loop.

public class TraversingStringArray {

    public static void main(String arg[]){

        //Declaring and initializing an array of strings.
        String fruits[] = {"Apple","Banana","Cherry","Date"};

        //Printing each element using its index.
        System.out.println("Displaying array elements using normal for loop");
        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i]+"\t");
        }

        System.out.println();

    }
}