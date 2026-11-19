package UNIT1;
//WAP in Java to read and display a name using the Scanner class.
import java.util.Scanner;

public class ReadingAString{
	public static void main(String args[]) {
		String name;

		//Creating a Scanner object for reading input
		Scanner s = new Scanner(System.in);

		//Accepting the name from the user
		System.out.println("Enter Name");
		name = s.next();

		//Displaying the entered name
		System.out.println("Your Name is:" + name);

		s.close();
	}
}