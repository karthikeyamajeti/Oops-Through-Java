package UNIT1.TypesofVariables;
//WAP in Java to demonstrate the use of instance and static variables in a Bank class.

class Bank {
    //Declaring instance variables
    int accountNo;
    String customerName;
    
    //Declaring a static variable shared by all objects
    static double interestRate = 7.5;

    //Creating a parameterized constructor
    Bank(int accNo, String name) {
	accountNo = accNo;
        customerName = name;
    }
    void display() {
	//Displaying account details and common interest rate
	System.out.println(accountNo + " "+customerName + " "+ interestRate + "%");
    }
}

public class StaticVariableDemo {
    
    public static void main(String[] args) {
        
	//Creating Bank objects with different account details
	Bank b1 = new Bank(101, "Suresh");
	Bank b2 = new Bank(102, "Ravi");
	Bank b3 = new Bank(103, "Anil");
	Bank b4 = new Bank(104, "Neha");

	//Displaying the details of all bank customers
	b1.display();
	b2.display();
	b3.display();
	b4.display();
        
    }
}