package UNIT1.ControlStructures;
//WAP in Java to demonstrate the use of nested enhanced for loops to display elements of a 2D array.

public class NestedForEach {

    public static void main(String[] args) {

        //Declaring and initializing a 2D String array
        String[][] cities = {
            {"Amaravati", "Vijayawada", "Guntur"},
            {"Hyderabad", "Warangal", "Khammam"}
        };

        //Outer enhanced for loop to access each row
        for(String[] row : cities) {

            //Inner enhanced for loop to access each element in the row
            for(String city : row) {

                //Displaying each city
                System.out.println(city);
            }
        }

    }
}