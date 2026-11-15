package UNIT0;
/*
WAP to read an integer and print it.
If the input is not an integer, print "invalid input".
*/
import java.util.*;
public class ImplementationofBuiltInExceptions {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}