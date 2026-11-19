package UNIT1;
//WAP in Java to read and display Name, Gender, Age, Mobile Number and CGPA using the Scanner class.
import java.util.Scanner;

public class StudentDataUsingScannerClass{
    public static void main(String[] args) {
    	//Creating a Scanner object for reading input
        Scanner sc = new Scanner(System.in);
        
        //Accepting the name from the user
	System.out.println("Enter Name");
	String name = sc.next();

	//Accepting the gender from the user
	System.out.println("Enter Male/Female - M/F");
	char gender = sc.next().charAt(0);

        //Accepting age, mobile number and CGPA
	System.out.println("Enter Age, Mobile Number and CGPA");
	int age = sc.nextInt();
	long mobileNo = sc.nextLong();
	double cgpa = sc.nextDouble();

	//Displaying the entered details
	System.out.println("Name: " + name);
	System.out.println("Gender: " + gender);
	System.out.println("Age: " + age);
	System.out.println("Mobile Number: " + mobileNo);
	System.out.println("CGPA: " + cgpa);

	//Closing the Scanner object
	sc.close();
    }
}