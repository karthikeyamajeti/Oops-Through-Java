package UNIT0;
//WAP using `StringBuffer` to delete a character from a given string at the user-specified position. Validate the position and display the updated string if valid.
import java.util.*;
public class ImplementingStringBuffer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the string from the user
        System.out.print("Enter string:");
        String str = sc.nextLine();
        
        // Reading the position of the character to be deleted
        System.out.print("Enter position:");
        int pos = sc.nextInt();
        
        // Creating a StringBuffer object using the given string
        StringBuffer sb = new StringBuffer(str);
        
        // Checking whether the given position is valid
        if(pos>=0 && pos<sb.length()){
            // Deleting the character at the specified position
            sb.deleteCharAt(pos);
            
            // Displaying the updated string
            System.out.println(sb);
        }
        else{
            // Displaying an error message for an invalid position
            System.out.println("Invalid position");
        }

        // Closing Scanner object
        sc.close();
    }
}