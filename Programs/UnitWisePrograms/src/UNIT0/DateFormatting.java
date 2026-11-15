package UNIT0;
/*
WAP to read a date in yyyy-MM-dd format and display it in
Day, Month dd, yyyy format.
*/

import java.util.*;
import java.time.*;
import java.time.format.*;

public class DateFormatting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the date
        String date = sc.nextLine();

        // Convert the input string into LocalDate
        LocalDate d = LocalDate.parse(date);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        // Display the formatted date
        System.out.println(d.format(formatter));
    }
}