package UNIT0;
/*
WAP to perform search, delete, and display operations on a HashSet
using a menu-driven program.
*/
import java.util.*;

public class HashSetMenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hs = new HashSet<>();

        // Accepting number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        // Adding elements to HashSet
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }

        // Displaying menu continuously
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Search for an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    // Search operation
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();

                    if(hs.contains(search)){
                        System.out.println(search + " is found");
                    }
                    else{
                        System.out.println(search + " is not found");
                    }
                    break;

                case 2:
                    // Delete operation
                    System.out.print("Enter element to delete: ");
                    int delete = sc.nextInt();

                    if(hs.remove(delete)){
                        System.out.println(delete + " is deleted");
                    }
                    else{
                        System.out.println(delete + " does not exist");
                    }
                    break;

                case 3:
                    // Display elements
                    System.out.println("Current elements: " + hs);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option");
            }
        }
        
    }
}