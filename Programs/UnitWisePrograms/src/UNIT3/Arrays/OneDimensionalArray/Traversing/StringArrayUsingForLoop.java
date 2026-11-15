package UNIT3.Arrays.OneDimensionalArray.Traversing;
//WAP in Java to declare, initialize and print the elements of a String array using normal for loop.
public class StringArrayUsingForLoop {

    public static void main(String[] args) {

        //Declaring and initializing an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        //Using normal for loop to print the elements of the String array
        //Accessing each element using index
        for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }

    }
}